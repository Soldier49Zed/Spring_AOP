package com.houx.xml.main;

import com.houx.aop.verifier.RoleVerifier;
import com.houx.game.pojo.Role;
import com.houx.xml.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        RoleService roleService = ctx.getBean(RoleService.class);
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        Role role = new Role();
        role.setId(1l);
        role.setRoleName("role_name_1");
        role.setNote("note_1");
        if (roleVerifier.verify(role)) {
            roleService.printRole(role);
        }
    }
}
