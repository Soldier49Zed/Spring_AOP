package com.houx.aop.service.impl;

import com.houx.aop.service.RoleService;
import com.houx.game.pojo.Role;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description: 选择连接点
 */
@Component
public class RoleServiceImpl implements RoleService {

    @Override
    public void printRole(Role role) {
        System.out.println("{id: " + role.getId() + ", "
                + "role_name : " + role.getRoleName() + ", "
                + "note : " + role.getNote() + "}");
    }

    @Override
    public void printRole(Role role, int sort) {
        System.out.println("{id: " + role.getId() + ", "
                + "role_name : " + role.getRoleName() + ", "
                + "note : " + role.getNote() + "}");
        System.out.println(sort);
    }
}
