package com.atyyx.spring;

import com.atyyx.spring.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:16
 */
public class IOCByXMLTest {
    /**
     * 获取bean的三种方式
     * 1.根据bean的id去获取   获取的是Object的类型，还得自己强转
     * 2.根据bean的类型去获取
     * 注意：根据类型获取bean的时候，要求IOC容器中有且只有一个类
     * NoUniqueBeanDefinitionException :表示bean不是唯一的
     * NoSuchBeanDefinitionException: 表示没有对应的bean
     * 若没有任何一个类型匹配的bean，则抛出异常NoSuchBeanDefinitionException
     * 若有多个类型匹配的bean，则抛出异常NoUniqueBeanDefinitionException
     * 3.根据bean的id和类型来获取
     */
    @Test
    public void testIOC()
    {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过反射创建的对象，默认都是用无参的构造函数，要是没有无参构造函数，就会报错
        //加载配置文件，通过bean标签的class属性，利用反射去构造对象
        //1.第一种获取bean的方式   通过唯一标识来获取
        // Student stu = (Student)ioc.getBean("studentOne");
        //2.第二种获取bean的方式  通过类型来获取
        //Student stu = ioc.getBean(Student.class);
        //3.通过唯一表示+类型来获取bean   只要有id，一定获取的是唯一的
        //Student stu = ioc.getBean("studentOne", Student.class);
        // 通过向上转型，是不会有问题的
        //Person stu = ioc.getBean(Student.class);
        // 可以通过他所实现的父类或者他所实现的接口来找到这对应的bean
        //要求整个person类接口只能由一个类对象实现
        //Person stu = ioc.getBean(Person.class);
        Student stu = ioc.getBean("StudentSeven", Student.class);
        System.out.println(stu);
        //内部的bean只能在bean的内部使用，是无法在ioc容器中去获得
        //Class classInner = ioc.getBean("classInner", Class.class);
        //System.out.println(classInner);
//        Class aClass = ioc.getBean("ClassOne", Class.class);
//        System.out.println(aClass);
    }
}
