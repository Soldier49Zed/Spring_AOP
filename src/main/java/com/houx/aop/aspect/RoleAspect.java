package com.houx.aop.aspect;

import org.aspectj.lang.annotation.*;

import com.houx.game.pojo.Role;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description: 创建切面
 */

@Aspect
public class RoleAspect {

    @Pointcut("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void print(){

    }

    @Before("print()")
    //@Before("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..)) && within(com.houx.aop.service.impl.*)")
    public void before() {
        System.out.println("before ....");
    }

    @After("print()")
    //@After("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void after() {
        System.out.println("after ....");
    }


    @AfterReturning("print()")
    //@AfterReturning("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterReturning() {
        System.out.println("afterReturning ....");
    }


    @AfterThrowing("print()")
    //@AfterThrowing("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing ....");
    }
}

