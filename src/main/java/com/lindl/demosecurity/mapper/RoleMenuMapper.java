package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMenuMapper {

    @Select("select  * from sys_role_menu")
    public List<RoleMenu> findAll();
}
