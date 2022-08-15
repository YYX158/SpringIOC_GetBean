package com.atyyx.spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author yyx
 * @version 1.0
 * @date : 2022/8/15 18:47
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    private Integer tid;
    private String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
