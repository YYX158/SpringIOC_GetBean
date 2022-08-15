package com.atyyx.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 18:48
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Class {
    private Integer cid;
    private String cname;
    private List<Student> studentList;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
