package com.atyyx.spring.Service.impl;

import com.atyyx.spring.Service.UserService;
import com.atyyx.spring.dao.UserDao;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:04
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
