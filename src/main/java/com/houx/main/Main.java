package com.houx.main;

import com.houx.aop.config.AopConfig;
import com.houx.aop.service.RoleService;
import com.houx.game.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        //使用注解
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        //使用XML使用ClassPathXmlApplicationContext作为IoC容器
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config3.xml");
        RoleService roleService = ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        roleService.printRole(role);
        System.out.println("#################################################");

        //测试异常通知
        role = null;
        roleService.printRole(role);


    }
}
