package com.atyyx.spring.factory;

import com.atyyx.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:22
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
