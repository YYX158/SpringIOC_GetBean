package com.atyyx.spring;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 19:12
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException
    {
        ApplicationContext ioc= new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
