package com.houx.multi.main;

import com.houx.multi.bean.MultiBean;
import com.houx.multi.config.MultiConfig;
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
