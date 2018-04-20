package com.pollutioncms.service.api.impl;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.buss.UserBuzz;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.Response;
import com.pollutioncms.service.dto.UserDTO;
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
 * @discription UserServiceImpl
 * @date 2018-04-13
 **/
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserBuzz userBuzz;

    private Validator validator = ValidateFactory.getValidator();


    @Override
    public Response<LoginUserDTO> getLoginUser(String userName) {
        if (userName == null) {
            return null;
        }
        try {
            User user = userBuzz.getUserByName(userName);
            return Response.succResp(LoginUserDTO.toLoginUserDTO(user));
        } catch (DataAccessException e) {
            logger.error("get user by user name error", e);
            return Response.failResp(RespError.OPERATION_FAIL);
        }
    }

    @Override
    public Response<List<UserDTO>> listUserByRole(String roleName, Integer pageNum, Integer count) {
        if (roleName == null || pageNum == null || count == null) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        try {
            List<User> users = userBuzz.listUserByRole(roleName, pageNum, count);
            return Response.succResp(toDTOList(users));
        } catch (DataAccessException e) {
            logger.error("list user by role name error", e);
            return Response.failResp(RespError.OPERATION_FAIL);
        }
    }

    @Override
    public Response<List<UserDTO>> listUser(Integer pageNum, Integer count) {
        if (pageNum == null || count == null) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        List<User> users = null;
        try {
            users = userBuzz.listUser(pageNum, count);
            return Response.succResp(toDTOList(users));
        } catch (DataAccessException e) {
            logger.error("list user error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,do:{}", users);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @Override
    public Response<AuthUserDTO> getAuthUser(String userName) {
        if (userName == null) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        try {
            AuthUserDTO users = userBuzz.getAuthUser(userName);
            return Response.succResp(users);
        } catch (DataAccessException e) {
            logger.error("get auth user error", e);
            return Response.failResp(RespError.OPERATION_FAIL);
        }
    }

    @Override
    public Response<Void> saveUser(UserDTO userDTO) {
        Set<ConstraintViolation<UserDTO>> validateRes = validator.validate(userDTO);
        if (validator.validate(userDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<UserDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }
        userDTO.setId(null);

        try {
            if (userBuzz.saveUser(userDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("save user not effect,dto:{}", userDTO);
            }
        } catch (DataAccessException e) {
            logger.error("save user error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", userDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);

    }

    @Override
    public Response<Void> deleteUser(UserDTO userDTO) {
        Set<ConstraintViolation<UserDTO>> validateRes = validator.validate(userDTO, UserDTOValidator.NeedId.class, Default.class);
        if (validator.validate(userDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<UserDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }

        try {
            if (userBuzz.deleteUser(userDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("delete user not effect,dto:{}", userDTO);
            }
        } catch (DataAccessException e) {
            logger.error("delete user error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", userDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @Override
    public Response<Void> updateUser(UserDTO userDTO) {
        Set<ConstraintViolation<UserDTO>> validateRes = validator.validate(userDTO, UserDTOValidator.NeedId.class, Default.class);
        if (validator.validate(userDTO).size() != 0) {
            List<String> errorList = new ArrayList<>();
            validateRes.forEach((ConstraintViolation<UserDTO> error) -> errorList.add(error.getMessage()));
            return Response.failResp(errorList);
        }

        try {
            if (userBuzz.updateUser(userDTO.toDO())) {
                return Response.succResp(null);
            } else {
                logger.error("update user not effect,dto:{}", userDTO);
            }
        } catch (DataAccessException e) {
            logger.error("update user error", e);
        } catch (BeansException e) {
            logger.error("copy properties error,dto:{}", userDTO);
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    private List<UserDTO> toDTOList(List<User> list) {
        List<UserDTO> userDTOS = new ArrayList<>();
        try {
            for (User u : list) {
                userDTOS.add(UserDTO.toUserDTO(u));
            }
        } catch (BeansException e) {
            logger.error("copy user properties error");
        }
        return userDTOS;
    }

}
