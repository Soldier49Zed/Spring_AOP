package com.houx.aop_test.multi.config;

import com.houx.aop_test.multi.aspect.Aspect1;
import com.houx.aop_test.multi.aspect.Aspect2;
import com.houx.aop_test.multi.aspect.Aspect3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.houx.aop_test.multi")
public class MultiConfig {
    @Bean
    public Aspect1 getAspect1() {
        return new Aspect1();
    }

    @Bean
    public Aspect2 getAspect2() {
        return new Aspect2();
    }

    @Bean
    public Aspect3 getAspect3() {
        return new Aspect3();
    }
}
