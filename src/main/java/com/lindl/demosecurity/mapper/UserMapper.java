package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {

    public List<SysUser> findAll();

    public SysUser findByUserName(String userName);
}
