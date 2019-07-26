package com.lindl.demosecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: ldl
 * @Date: 2019/7/19 15:52
 */
@Data
@Accessors
@AllArgsConstructor
@NoArgsConstructor
public class SysUser implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
