package com.wake.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName dept
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}