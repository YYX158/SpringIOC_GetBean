package com.atyyx.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 18:45
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private  Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private Class belongClass;
    private String[] hobby;
    private Map<String,Teacher> teacherMap;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Class getBelongClass() {
        return belongClass;
    }

    public void setBelongClass(Class belongClass) {
        this.belongClass = belongClass;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }
}
