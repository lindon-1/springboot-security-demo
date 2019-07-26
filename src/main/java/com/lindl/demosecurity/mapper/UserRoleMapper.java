package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRoleMapper {

    //@Select("select  * from sys_user_role")
    public List<UserRole> findAll();
}
