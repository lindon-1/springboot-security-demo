package com.lindl.demosecurity.Service.impl;

import com.lindl.demosecurity.Service.UserService;
import com.lindl.demosecurity.entity.SysUser;
import com.lindl.demosecurity.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ldl
 * @Date: 2019/7/22 15:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public SysUser selectByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }
}
