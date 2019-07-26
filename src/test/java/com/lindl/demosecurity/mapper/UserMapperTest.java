package com.lindl.demosecurity.mapper;

import com.lindl.demosecurity.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private RoleMenuMapper roleMenuMapper;

    @Resource
    private MenuMapper menuMapper;

    @Test
    public void test() {
        List<SysUser> list = userMapper.findAll();
        list.forEach(e -> System.out.println(list.toString()));

        List<SysRole> all = roleMapper.findAll();
        all.forEach(e -> System.out.println(e.toString()));

        List<UserRole> userRoles = userRoleMapper.findAll();
        userRoles.forEach(e -> System.out.println(e.toString()));

        List<RoleMenu> roleMenus = roleMenuMapper.findAll();
        roleMenus.forEach(e -> System.out.println(e.toString()));

        List<SysMenu> menus = menuMapper.findAll();
        menus.forEach(e -> System.out.println(e.toString()));
    }
}