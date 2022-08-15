package com.atyyx.spring;

import com.atyyx.spring.pojo.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:17
 */
public class ScopeTest {
    @DisplayName("测试Bean中的单例对象")
    @Test
    public void testScope()
    {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-scope.xml");
        // 第一次获取
        Student student1 = ioc.getBean(Student.class);
        // 第二次获取
        Student student2 = ioc.getBean(Student.class);
        // 可以利用equals 和== 的方法默认是比较内存地址

        System.out.println(student1.equals(student2));
        // String类中的==、equal比较的是值而不是内存地址
        // 因为字符串是常量，所以存在常量池中
        //每一次要给字符串赋值的时候，先去常量池中看看有没有相等的值，如果有则直接给出
        // 如果没有的话，则看看有没有空闲的空间，开辟一个新的内存空间给其存放新的值

//        String a="abc";
//        String b ="abc";
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
    }
}
