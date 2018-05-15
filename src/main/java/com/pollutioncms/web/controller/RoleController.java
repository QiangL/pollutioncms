package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.common.exception.BaseException;
import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.dto.RoleDTO;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.service.dto.validator.RoleDTOValidator;
import com.pollutioncms.web.contants.Constants;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.BindErrorHandler;
import com.pollutioncms.web.vo.LigerGridVo;
import com.pollutioncms.web.vo.RoleVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.easybooks.bookstore.dao.impl.Ent_viewDAO;
import org.easybooks.bookstore.dao.impl.Outfall_viewDAO;
import org.easybooks.bookstore.vo.Outfall_view;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.pollutioncms.web.contants.Constants.NUM_EACH_PAGE;

/**
 * 角色管理的Controller
 *
 * @author liqiag
 * @discription RoleController
 * @date 2018-04-20
 **/
@RestController
@RequestMapping("/authManage/role")
public class RoleController {
    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @Autowired
    private Outfall_viewDAO outfall_viewDAO;

    @Autowired
    private Ent_viewDAO ent_viewDAO;

    @GetMapping("/listRoles.mvc")
    @RequiresPermissions("role:list")
    public LigerGridVo<RoleVO> listRoles(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                         @RequestParam(value = "count", required = false) Integer count) {
        if (pageNum == null) {
            pageNum = 0;
        }
        if (count == null) {
            count = NUM_EACH_PAGE;
        }
        return LigerGridVo.Resp(toVOs(roleService.listRoles(pageNum, count)), roleService.getCount());
    }

    @PostMapping("/addRole.mvc")
    @RequiresPermissions("role:add")
    public Response<?> addRole(@RequestBody @Validated RoleDTO roleDTO,
                               BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("add role,dto:{}", roleDTO);
        if (Constants.NO_RELATE_EN_NO.equals(roleDTO.getEntNo())) {
            roleDTO.setEntNo(null);
        }
        if(roleService.checkRoleName(roleDTO.getRoleName())){
            return Response.failResp(RespError.ROLE_NAME_DUPLICATE);
        }
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        roleService.saveRole(((UserDTO) session.getAttribute(Constants.USER)).getUserName(), roleDTO);
        return Response.succResp();
    }

    @PostMapping("/deleteRole.mvc")
    @RequiresPermissions("role:delete")
    public Response<?> deleteRole(@RequestBody @Validated(value = {Default.class, RoleDTOValidator.NeedId.class}) RoleDTO roleDTO,
                                  BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("delete role,dto:{}", roleDTO);
        try {
            roleService.deleteRole(roleDTO);
            return Response.succResp();
        } catch (BaseException e) {
            return Response.failResp(e.getErrorMsg());
        }

    }

    @PostMapping("/updateRole.mvc")
    @RequiresPermissions("role:update")
    public Response<?> updateRole(@RequestBody @Validated({RoleDTOValidator.NeedId.class, Default.class}) RoleDTO roleDTO,
                                  BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("update role,dto:{}", roleDTO);
        if (Constants.NO_RELATE_EN_NO.equals(roleDTO.getEntNo())) {
            roleDTO.setEntNo(null);
        }
        roleService.updateRoleSelective(roleDTO);
        return Response.succResp();
    }

    /**
     * 没有权限的接口
     *
     * @return
     */
    @GetMapping("/queryRoleNames.mvc")
    public JSONArray queryRoleNames() {
        Set<String> roleNameSet = roleService.queryRoleNames();
        JSONArray array = new JSONArray();
        roleNameSet.forEach(name -> {
            JSONObject object = new JSONObject();
            object.put("id", name);
            object.put("text", name);
            array.add(object);
        });
        return array;
    }

    @GetMapping("/listEnter.mvc")
    public JSONArray listEnter() {
        List<Outfall_view> list = outfall_viewDAO.getAllOutfall_views();
        JSONArray jsonArray = new JSONArray();
        JSONObject json;
        for (Outfall_view o : list) {
            json = new JSONObject();
            json.put("id", o.getOV_no());
            json.put("name", o.getEnt_name());
            jsonArray.add(json);
        }
        json = new JSONObject();
        json.put("id", Constants.NO_RELATE_EN_NO);
        json.put("name", "不关联任何企业");
        jsonArray.add(json);
        return jsonArray;
    }

    private List<RoleVO> toVOs(List<RoleDTO> dtos) {
        List<RoleVO> vos = new ArrayList<>();
        for (RoleDTO dto : dtos) {
            RoleVO vo = RoleVO.toVO(dto);
            vo.setEntNo(String.valueOf(dto.getEntNo()));
            vos.add(vo);
        }
        return vos;
    }
}
