package com.lindl.demosecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: ldl
 * @Date: 2019/7/22 14:41
 */

//@Table(name = "sys_user_role")
@Accessors
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRole implements Serializable{

//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Long id;

//    @Column(name = "user_id")
    private Long userId;

//    @Column(name = "role_id")
    private Long roleId;
}
