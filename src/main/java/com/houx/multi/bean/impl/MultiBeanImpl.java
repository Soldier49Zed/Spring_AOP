package com.houx.multi.bean.impl;

import com.houx.multi.bean.MultiBean;
import org.springframework.stereotype.Component;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
@Component
public class MultiBeanImpl implements MultiBean {
    @Override
    public void testMulti() {
        System.out.println("test multi aspects!!!");
    }
}
