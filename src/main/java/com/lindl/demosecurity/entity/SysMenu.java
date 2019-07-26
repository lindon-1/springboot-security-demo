package com.lindl.demosecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: ldl
 * @Date: 2019/7/22 14:36
 */
//@Table(name = "sys_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class SysMenu implements Serializable {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "JDBC")  //插入数据后获取插入的自增id
    private Long id;

//    @Column(name = "url")
    private String url;

//    @Column(name = "seq")
    private String seq;

//    @Column(name = "parent_ids")
    private String parentIds;

//    @Column(name = "icon")
    private String icon;

//    @Column(name = "is_leaf")
    private String isLeaf;

}
