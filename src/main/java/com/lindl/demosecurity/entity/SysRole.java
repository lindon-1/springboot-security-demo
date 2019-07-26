package com.lindl.demosecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: ldl
 * @Date: 2019/7/22 14:24
 */
@Table(name = "sys_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class SysRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")  //插入数据后获取插入的自增id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
