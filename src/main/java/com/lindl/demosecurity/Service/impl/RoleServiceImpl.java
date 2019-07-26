package com.lindl.demosecurity.Service.impl;

import com.lindl.demosecurity.Service.RoleService;
import com.lindl.demosecurity.entity.SysRole;
import com.lindl.demosecurity.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ldl
 * @Date: 2019/7/22 15:33
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;
    @Override
    public SysRole selectByUserId(Long userId) {
        return roleMapper.findByUserId(userId);
    }
}
