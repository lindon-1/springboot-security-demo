package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface MenuMapper {

//    @Select("select * from sys_menu")
    public List<SysMenu> findAll();

}
