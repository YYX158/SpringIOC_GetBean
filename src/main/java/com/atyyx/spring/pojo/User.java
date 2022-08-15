package com.atyyx.spring.pojo;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 18:44
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;



    public Integer getId() {
        return id;
    }

    // 无参构造函数
    public User() {
        System.out.println("生命周期1：实例化");
    }

    public void setId(Integer id) {
        System.out.println("生命周期2：依赖注入id");
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("生命周期2：依赖注入username");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("生命周期2：依赖注入password");
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("生命周期2：依赖注入age");
        this.age = age;
    }

    public User(Integer id, String username, String password, Integer age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
    public  void initMethod()
    {
        System.out.println("生命周期3：初始化");
    }
    public  void destoryMethod()
    {
        System.out.println("生命周期4：销毁");
    }
}
