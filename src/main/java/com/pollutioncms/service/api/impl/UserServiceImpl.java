package com.pollutioncms.service.api.impl;

import com.github.pagehelper.PageHelper;
import com.pollutioncms.common.enums.ExceptionEnum;
import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiag
 * @discription UserServiceImpl
 * @date 2018-04-13
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUser(String userName) {
        return UserDTO.toUserDTO(getUserByName(userName));
    }

    @Override
    public LoginUserDTO getLoginUser(String userName) {
        User user=getUserByName(userName);
        if (user == null) {
            logger.error("query username not exit,username:{}",userName);
            throw new ParamErrorException("user not exit");
        }
        return LoginUserDTO.toLoginUserDTO(user);
    }

    @Override
    public List<UserDTO> listUserByRole(String roleName, Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return toDTOList(userMapper.listUserByRole(roleName));
    }

    @Override
    public List<UserDTO> listUser(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return toDTOList(userMapper.selectAll());
    }

    @Override
    public AuthUserDTO getAuthUser(String userName) {
        AuthUserDTO authUserDTO = new AuthUserDTO();
        if (getUserByName(userName) == null) {
            logger.error("query username not exit,username:{}",userName);
            throw new ParamErrorException("user not exit");
        }
        authUserDTO.setUserName(userName);
        authUserDTO.setRoles(userMapper.listRoles(userName));
        authUserDTO.setPermissions(userMapper.listPermissions(userName));
        return authUserDTO;
    }

    @Override
    public int getCount() {
        return userMapper.selectCount(null);
    }

    @Override
    public boolean saveUser(UserDTO userDTO) {
        if (userMapper.insert(userDTO.toDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",userDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        else return true;

    }

    @Override
    public boolean deleteUser(UserDTO userDTO) {
        if (userMapper.delete(userDTO.toDO()) != 2){
            // == 2说明 user表和role_user表都删除了
            logger.error("dao operate effect num error,dto:{}",userDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        else return true;
    }

    @Override
    public boolean updateUserSelective(UserDTO userDTO) {
        if (userMapper.updateByPrimaryKeySelective(userDTO.toDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",userDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        else return true;
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

    private User getUserByName(String userName) {
        return userMapper.selectOneByExample(Example.builder(User.class)
                .where(Sqls.custom().andEqualTo("userName", userName)).build());
    }

}
