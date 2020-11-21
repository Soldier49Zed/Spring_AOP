package com.houx.database_test.main;

import com.houx.database_test.mapper.RoleMapper;
import com.houx.database_test.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/22
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config2.xml");
        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("role_name_1");
        role.setNote("note_mapper");
        roleMapper.insertRole(role);
        Long id = role.getId();
        roleMapper.getRole(id);
        role.setNote("note_mapper_update");
        roleMapper.updateRole(role);
        roleMapper.deleteRole(id);
    }

}
