package com.example.springbootdemo.security.controller;

import com.example.springbootdemo.security.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ShiroController {

    @Resource
    private UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            return "账户不存在";

        } catch (DisabledAccountException e) {
            return "账户存在问题";

        } catch (AuthenticationException e) {
            return "密码错误";

        } catch (Exception e) {
            return"登陆异常";
        }
        //根据权限，指定返回数据
       /* String role = userMapper.getRole(username);
        if ("user".equals(role)) {
            return resultMap.success().message("欢迎登陆");
        }
        if ("admin".equals(role)) {
            return resultMap.success().message("欢迎来到管理员页面");
        }
        return resultMap.fail().message("权限错误！");*/
        return "登陆成功";
    }
}
