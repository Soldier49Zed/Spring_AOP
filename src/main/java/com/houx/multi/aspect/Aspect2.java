package com.houx.multi.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
@Aspect
@Order(2)
public class Aspect2 {
    @Pointcut("execution(* com.houx.multi.bean.impl.MultiBeanImpl.testMulti(..))")
    public void print(){

    }

    @Before("print()")
    public void before() {
        System.out.println("before 222");
    }

    @After("print()")
    public void after() {
        System.out.println("after 222");
    }


    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning 222");
    }


    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 222");
    }
}
