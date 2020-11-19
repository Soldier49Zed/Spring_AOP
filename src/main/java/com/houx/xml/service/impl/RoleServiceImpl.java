package com.houx.xml.service.impl;

import com.houx.aop.verifier.RoleVerifier;
import com.houx.game.pojo.Role;
import com.houx.xml.service.RoleService;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class RoleServiceImpl implements RoleService {

    public RoleVerifier roleVerifier = null;

    @Override
    public void printRole(Role role) {
        System.out.print("id = " + role.getId() + ",");
        System.out.print("role_name = " + role.getRoleName() + ",");
        System.out.println("note = " + role.getNote());
    }
}
