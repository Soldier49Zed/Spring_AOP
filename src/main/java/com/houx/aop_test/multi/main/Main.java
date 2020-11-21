package com.houx.aop_test.multi.main;

import com.houx.aop_test.multi.bean.MultiBean;
import com.houx.aop_test.multi.config.MultiConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("#########################################\n\n\n");
            ApplicationContext ctx = new AnnotationConfigApplicationContext(MultiConfig.class);
            MultiBean multiBean = ctx.getBean(MultiBean.class);
            multiBean.testMulti();

        }
    }
}
