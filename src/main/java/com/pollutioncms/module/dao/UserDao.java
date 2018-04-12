package com.pollutioncms.module.dao;

import com.pollutioncms.module.domain.User;

import java.util.List;
import java.util.Set;

public interface UserDao {

    User getById(Integer id);

    int deleteById(Integer id,Integer...ids);

    boolean insert(User user);

    boolean update(User user);

    List<User> listByIds(List<Integer> ids);

    /** 获取所有授权字符串 **/
    Set<String> listPermissions();
 }
