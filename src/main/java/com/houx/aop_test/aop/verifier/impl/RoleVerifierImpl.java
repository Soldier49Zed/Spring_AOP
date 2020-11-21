package com.houx.aop_test.aop.verifier.impl;

import com.houx.aop_test.aop.verifier.RoleVerifier;
import com.houx.aop_test.game.pojo.Role;

/**
 * @Author: HouX
 * @Date: 2020/11/19
 * @Description:
 */
public class RoleVerifierImpl implements RoleVerifier {
    @Override
    public boolean verify(Role role) {
        return role != null;
    }
}
