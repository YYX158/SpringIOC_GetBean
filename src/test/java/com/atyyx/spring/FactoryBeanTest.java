package com.atyyx.spring;

import com.atyyx.spring.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:14
 */
public class FactoryBeanTest {

    /**
     * FactoryBean是一个接口，需要创建一个类来实现该接口
     * 其中有三个方法
     * getObject(): 通过一个对象交给ioc容器管理
     * getObjectType(): 设置所提供对象的类型
     * isSingLeton(): 所提供的对象是否为单例
     * 当吧FactoryBean的实现类配置为bean的时候，会将当前类中getObject()所返回的对象交给ioc容器进行管理
     */
    @Test
    public void testFactoryBean()
    {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-factory.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
    }
}
