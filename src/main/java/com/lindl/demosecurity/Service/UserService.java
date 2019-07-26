package com.lindl.demosecurity.Service;

import com.lindl.demosecurity.entity.SysUser;
import org.springframework.stereotype.Service;


public interface UserService {

    public SysUser selectByUserName(String userName);
}
