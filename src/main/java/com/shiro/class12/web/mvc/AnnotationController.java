package com.shiro.class12.web.mvc;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-12
 * <p>Version: 1.0
 */
@Controller
public class AnnotationController {

    @RequestMapping("/hello1")
    public String hello1() {
        SecurityUtils.getSubject().checkRole("admin");
        return "success";
    }

    @RequiresRoles("admin")
    @RequestMapping("/hello2")
    public String hello2() {
        return "success";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @RequestMapping(value="/loginSuccess",method=RequestMethod.GET)
    public String loginSuccess() {
        return "loginSuccess";
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login2(@RequestParam("username") String username ,@RequestParam("password") String password,Model model) {
    	String error = null;
    	Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            error = "�û���/�������";
        } catch (IncorrectCredentialsException e) {
            error = "�û���/�������";
        } catch (AuthenticationException e) {
            //�������󣬱�������������뵥�������뵥��catch����
            error = "��������" + e.getMessage();
        }

        if(error != null) {//�����ˣ����ص�¼ҳ��
        	model.addAttribute("error", error);
            return "login";
        } else {//��¼�ɹ�
            return "loginSuccess";
        }
    }
    
    
}
