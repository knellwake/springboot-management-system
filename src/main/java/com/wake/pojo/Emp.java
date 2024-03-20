package com.wake.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    private LocalDate entrydate;

    private Integer deptId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;
}