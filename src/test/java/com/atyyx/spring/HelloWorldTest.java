package com.atyyx.spring;

import com.atyyx.spring.pojo.Helloworld;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:15
 */
@DisplayName("IOC容器测试类")
public class HelloWorldTest {
    @Test
    public void test()
    {
        // 获取ioc容器
        //ApplicationContext是ClassPathXmlApplicationContext的父类
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Helloworld helloworldBean = (Helloworld)ioc.getBean("helloworld");
        helloworldBean.sayHello();
    }
}
