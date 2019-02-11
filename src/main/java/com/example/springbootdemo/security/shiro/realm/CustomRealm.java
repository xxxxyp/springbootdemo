package com.example.springbootdemo.security.shiro.realm;

import com.example.springbootdemo.security.dao.UserDao;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public class CustomRealm extends AuthorizingRealm {

    @Resource
    private UserDao userDao;

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String currentUserName = (String)principalCollection.getPrimaryPrincipal();
        List<String> roles = new ArrayList<String>();  //角色
        List<String> prems = new ArrayList<String>(); //权限
        roles.add("baidu");
        roles.add("google");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roles);
        authorizationInfo.addStringPermissions(prems);
        return authorizationInfo;
    }

    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //把
        UsernamePasswordToken token = (UsernamePasswordToken )authenticationToken;
        String username = token.getUsername();
        // 从数据库获取对应用户名密码的用户
        String password = userDao.getPassword(token.getUsername());
        if (null == password) {
            throw new AccountException("用户名不正确");
        } else if (!password.equals(new String((char[]) token.getCredentials()))) {
            throw new AccountException("密码不正确");
        }
        return new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
    }
}
