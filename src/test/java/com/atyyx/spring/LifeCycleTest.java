package com.atyyx.spring;

import com.atyyx.spring.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:17
 */
public class LifeCycleTest {
    /**
     * bean的生命周期
     * 1.ioc容器进行类的实例化
     * 2.依赖注入
     * 3.初始化
     * 4.销毁：当ioc容器关闭的时候就销毁
     */
    @Test
    public void test()
    {
        //ConfigurableApplicationContext是ApplicationContext的子接口
        // 其中扩展了刷新和刷新和关闭容器的方法
        ConfigurableApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        //ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();

    }
}
