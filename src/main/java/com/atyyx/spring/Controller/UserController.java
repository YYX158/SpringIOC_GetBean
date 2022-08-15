package com.atyyx.spring.Controller;

import com.atyyx.spring.Service.UserService;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:03
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser()
    {
        userService.saveUser();
    }
}
