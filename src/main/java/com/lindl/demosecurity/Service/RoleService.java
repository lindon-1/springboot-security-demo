package com.lindl.demosecurity.Service;

import com.lindl.demosecurity.entity.SysRole;

public interface RoleService {

    public SysRole selectByUserId(Long userId);
}
