package com.pollutioncms.service.api.impl;

import com.pollutioncms.module.domain.Role;
import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.buss.RoleBuzz;
import com.pollutioncms.service.dto.Response;
import com.pollutioncms.service.dto.RoleDTO;
import com.pollutioncms.service.enums.RespError;
import com.pollutioncms.service.utils.ValidateFactory;
import com.pollutioncms.service.validator.UserDTOValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author liqiag
 * @discription RoleServiceImpl
 * @date 2018-04-19
 **/
@Service
public class RoleServiceImpl implements RoleService {
    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleBuzz roleBuzz;

    private Validator validator = ValidateFactory.getValidator();

    @Override
    public Response<List<RoleDTO>> listRoles(Integer pageNum, Integer count) {
        if (pageNum == null || count == null) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        List<Role> roleDTOS = null;
        try {
            roleDTOS = roleBuzz.listRoles(pageNum, count);
            return Response.succResp(toDTOList(roleDTOS));
        } catch (DataAccessException e) {
            logger.error("list role from db error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,do:{}", roleDTOS);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @Override
    public Response<Void> saveRole(RoleDTO roleDTO) {
        Set<ConstraintViolation<RoleDTO>> validateRes = validator.validate(roleDTO, UserDTOValidator.NeedId.class, Default.class);
        if (validator.validate(roleDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<RoleDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }
        try {
            if (roleBuzz.saveRole(roleDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("save role to db not effect,dto:{}", roleDTO);
            }
        } catch (DataAccessException e) {
            logger.error("save role to db error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", roleDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);

    }

    @Override
    public Response<Void> deleteRole(RoleDTO roleDTO) {
        Set<ConstraintViolation<RoleDTO>> validateRes = validator.validate(roleDTO, UserDTOValidator.NeedId.class, Default.class);
        if (validator.validate(roleDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<RoleDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }
        try {
            if (roleBuzz.deleteRole(roleDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("delete role to db not effect,dto:{}", roleDTO);
            }
        } catch (DataAccessException e) {
            logger.error("delete role to db error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", roleDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @Override
    public Response<Void> updateRole(RoleDTO roleDTO) {
        Set<ConstraintViolation<RoleDTO>> validateRes = validator.validate(roleDTO, UserDTOValidator.NeedId.class, Default.class);
        if (validator.validate(roleDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<RoleDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }
        try {
            if (roleBuzz.updateRole(roleDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("update role to db not effect,dto:{}", roleDTO);
            }
        } catch (DataAccessException e) {
            logger.error("update role to db error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", roleDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    private List<RoleDTO> toDTOList(List<Role> list) {
        List<RoleDTO> roleDTOS = new ArrayList<>();
        try {
            for (Role r : list) {
                roleDTOS.add(RoleDTO.toRoleDTO(r));
            }
        } catch (BeansException e) {
            logger.error("copy properties error", e);
        }
        return roleDTOS;
    }
}
