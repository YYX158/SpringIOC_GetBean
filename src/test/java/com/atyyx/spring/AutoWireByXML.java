package com.atyyx.spring;

import com.atyyx.spring.Controller.UserController;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:11
 */
public class AutoWireByXML {
    /**
     * 自动装配
     * 根据指定的策略，在ioc中匹配某个bean，
     * 自动为当前的属性进行赋值
     * 可以通过bean标签中的autowire属性设置自动装配的策略
     * 自动装配的策略：
     * no,default：表示不，即bena中的属性不会自动匹配到某个bean为属性赋值，此时属性使用默认值
     * byType:根据类型自动装配
     * 注意：①若通过类型没有找到任何一个类型匹配的bean，此时不装配 ，属性就是用默认值
     * ②若通过类型中好到多个匹配的bean，则会抛出异常：NoUniqueBeanDefinitionException
     * 总结：当使用byType实现自动装配时候，ioc容器有且只有一个类型匹配的bean能够为属性赋值
     * 3.byName：将要赋值的属性的属性名作为bean的id在ioc容器中去匹配某个bean，为属性赋值
     * 总结：当类型匹配有多个bean的时候，可以用byName实现自动装配
     */
    @DisplayName("用xml来模拟MVC三层架构")
    @Test
    public void testAutowire()
    {
        ApplicationContext ioc= new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
