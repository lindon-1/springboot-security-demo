package com.lindl.demosecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: ldl
 * @Date: 2019/7/22 14:47
 */
@Table(name = "sys_role_menu")
@AllArgsConstructor
@Accessors
@Data
@NoArgsConstructor
public class RoleMenu implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    public Long id;

    @Column(name = "role_id")
    public Long roleId;
    @Column(name = "menu_id")
    public Long menuId;
}
