package com.houx.aop.verifier.impl;

import com.houx.aop.verifier.RoleVerifier;
import com.houx.game.pojo.Role;

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
