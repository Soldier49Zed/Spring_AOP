package com.houx.aop.aspect;

import com.houx.aop.verifier.RoleVerifier;
import com.houx.aop.verifier.impl.RoleVerifierImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import com.houx.game.pojo.Role;

/**
 * @Author: HouX
 * @Date: 2020/11/18
 * @Description: 创建切面
 */

@Aspect
public class RoleAspect {

    @DeclareParents(value = "com.houx.aop.service.impl.RoleServiceImpl+", defaultImpl = RoleVerifierImpl.class)
    public RoleVerifier roleVerifier;


    @Pointcut("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void print() {

    }

    @Before("execution(* com.houx.aop.service.impl.RoleServiceImpl.printRole())" + "&& args(role,sort)")
    public void before(Role role, int sort) {
        System.out.println("before");
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


    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around before ...");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after ...");
    }
}

