package com.houx.aop_test.multi.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
@Aspect
@Order(1)
public class Aspect1 {
    @Pointcut("execution(* com.houx.aop_test.multi.bean.impl.MultiBeanImpl.testMulti(..))")
    public void print(){

    }

    @Before("print()")
    public void before() {
        System.out.println("before 111");
    }

    @After("print()")
    public void after() {
        System.out.println("after 111");
    }


    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning 111");
    }


    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 111");
    }
}
