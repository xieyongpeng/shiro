package com.shiro.class6.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

import com.shiro.class6.bean.User;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-29
 * <p>Version: 1.0
 */
public class MyRealm3 implements Realm {

    @Override
    public String getName() {
        return "c"; //realm name 为 “c”
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        User user = new User("zhang", "123");
        return new SimpleAuthenticationInfo(
                user, //身份 User类型
                "123",   //凭据
                getName() //Realm Name
        );
    }
}
