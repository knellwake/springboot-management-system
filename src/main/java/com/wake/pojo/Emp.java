package com.wake.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName emp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private Integer gender;

    private String image;

    private Integer job;

    private Date entrydate;

    private Integer deptId;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}