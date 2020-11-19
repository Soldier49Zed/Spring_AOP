package com.houx.xml.aspect;

import com.houx.game.pojo.Role;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class XmlAspect {
    void before(Role role) {
        System.out.println("role_id= " + role.getId() + "before ......");
    }

    void after() {
        System.out.println("after ......");
    }

    void afterThrowing() {
        System.out.println("after-throwing ......");
    }

    void afterReturning() {
        System.out.println("after-returning ......");
    }

    void around(ProceedingJoinPoint jp) {
        System.out.println("around before ......");

        try {
            jp.proceed();
        } catch (Throwable throwable) {
            new RuntimeException("回调原有流程，产生异常");
        }
        System.out.println("around after ......");
    }
}
