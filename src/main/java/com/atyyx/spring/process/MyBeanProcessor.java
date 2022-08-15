package com.atyyx.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:09
 */
public class MyBeanProcessor implements BeanPostProcessor {
    /**
     * 此方法在bean的生命周期初始化之前就执行
     * @param bean  这个bean其实就是我们ioc容器中的bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器的postProcessBeforeInitialization方法");
        return bean;
    }

    /**
     * 此方法在bean的生命周期初始化之后就执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器的postProcessAfterInitialization方法");
        return bean;
    }
}
