package com.pollutioncms.web.controller;

import com.pollutioncms.service.api.ModuleService;
import com.pollutioncms.service.dto.ModuleDTO;
import com.pollutioncms.service.dto.validator.ModuleDTOValidator;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.BindErrorHandler;
import com.pollutioncms.web.vo.LigerGridVo;
import com.pollutioncms.web.vo.LigerTreeVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiag
 * @discription ModuleController
 * @date 2018-04-28
 **/
@RestController
@RequestMapping(("/framework/module"))
public class ModuleController {
    private static final Logger logger = LoggerFactory.getLogger(ModuleController.class);

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/listModules.mvc")
    @RequiresPermissions("module:listModule")
    public List<LigerTreeVO> listModule() {
        List<ModuleDTO> moduleDTOS = moduleService.listModule();
        return fill(moduleDTOS);
    }

    @GetMapping("/listOps.mvc")
    @RequiresPermissions("module:listOps")
    public LigerGridVo<?> listOps(@RequestParam("parentId") Integer parentId) {
        List<ModuleDTO> moduleDTOS = moduleService.listModuleOps(parentId);
        return LigerGridVo.Resp(moduleDTOS, moduleService.getModuleOpsCount(parentId));
    }

    @PostMapping("/addModule.mvc")
    @RequiresPermissions("module:add")
    public Response<?> addModule(@RequestBody @Validated({ModuleDTOValidator.ModuleOps.class, Default.class}) ModuleDTO moduleDTO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("add module ,vo:{}", moduleDTO);
        moduleService.saveModule(moduleDTO);
        return Response.succResp();
    }

    @PostMapping("/deleteModule.mvc")
    @RequiresPermissions("module:delete")
    public Response<?> deleteModule(@RequestBody @Validated({ModuleDTOValidator.ModuleOps.class, ModuleDTOValidator.NeedId.class, Default.class}) ModuleDTO moduleDTO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("delete module ,vo:{}", moduleDTO);
        moduleService.deleteModule(moduleDTO);
        return Response.succResp();
    }

    @PostMapping("/updateModule.mvc")
    @RequiresPermissions("module:update")
    public Response<?> updateModule(@RequestBody @Validated({ModuleDTOValidator.ModuleOps.class, ModuleDTOValidator.NeedId.class, Default.class}) ModuleDTO moduleDTO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("update module ,vo:{}", moduleDTO);
        moduleService.updateModule(moduleDTO);
        return Response.succResp();
    }

    private LigerTreeVO fill(ModuleDTO dto) {
        LigerTreeVO data = new LigerTreeVO();
        data.setId(dto.getId());
        data.setPid(dto.getPid());
        data.setText(dto.getName());
        return data;
    }

    private List<LigerTreeVO> fill(List<ModuleDTO> dtos) {
        List<LigerTreeVO> datas = new ArrayList<>();
        for (ModuleDTO dto : dtos) {
            datas.add(fill(dto));
        }
        return datas;
    }
}
