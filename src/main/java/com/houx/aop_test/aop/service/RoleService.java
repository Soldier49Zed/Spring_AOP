package com.houx.aop_test.aop.service;

import com.houx.aop_test.game.pojo.Role;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description:
 */
public interface RoleService {
    void  printRole(Role role);
    public void printRole(Role role, int sort);
}
