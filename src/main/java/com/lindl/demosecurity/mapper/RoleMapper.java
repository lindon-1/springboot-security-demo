package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {

    @Select("select * from sys_role")
    public List<SysRole> findAll();

    @Select("select * from sys_role where user_id = #{userId}")
    public SysRole findByUserId(Long userId);
}
