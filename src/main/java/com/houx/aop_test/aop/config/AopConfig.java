package com.houx.aop_test.aop.config;

import com.houx.aop_test.aop.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description:
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.houx.aop_test.aop")
public class AopConfig {

    @Bean
    public RoleAspect getRoleAspect(){
        return new RoleAspect();
    }
}
