package com.atyyx.spring.dao.impl;

import com.atyyx.spring.dao.UserDao;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:06
 */
public class UserDaoImpl implements UserDao {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        System.out.println("保存用户成功");
    }
}
