package com.houx.main;

import com.houx.aop.config.AopConfig;
import com.houx.aop.service.RoleService;
import com.houx.aop.service.impl.RoleServiceImpl;
import com.houx.aop.verifier.RoleVerifier;
import com.houx.aop.verifier.impl.RoleVerifierImpl;
import com.houx.game.pojo.Role;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);

        RoleService roleService =  ctx.getBean(RoleService.class);
        RoleVerifier roleVerifier = (RoleVerifier) roleService;
        Role role = new Role();
        role.setId(1l);
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        if (roleVerifier.verify(role)){
            roleService.printRole(role);
        }


    }
}
