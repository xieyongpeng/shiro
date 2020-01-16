package com.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Test;


public class LoginLogoutTest {
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
//	@Test
//	public void testHelloWorld2(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro-realm.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "1234");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro-realm2.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("ma", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro-authenticator-all-success.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    	PrincipalCollection principalCollection = subject.getPrincipals();
//	    	System.out.println(principalCollection.asList().size());
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	


//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:shiro-passwordservice.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("wu", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    	PrincipalCollection principalCollection = subject.getPrincipals();
//	    	System.out.println(principalCollection.asList());
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:class6/shiro.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("wu", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    	PrincipalCollection principalCollection = subject.getPrincipals();
//	    	System.out.println(principalCollection.asList());
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
	
//	@Test
//	public void testHelloWorld(){
//		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//		Factory<SecurityManager> factory =  
//	            new IniSecurityManagerFactory("classpath:class6/shiro-multirealm.ini");
//		//2、得到SecurityManager实例 并绑定给SecurityUtils  
//	    SecurityManager securityManager = factory.getInstance();
//	    SecurityUtils.setSecurityManager(securityManager);
//	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//	    Subject subject  = SecurityUtils.getSubject();
//	    UsernamePasswordToken token = new UsernamePasswordToken("wu", "123");
//	    try {  
//	        //4、登录，即身份验证  
//	        subject.login(token);  
//	    } catch (AuthenticationException e) {  
//	        //5、身份验证失败  
//	    }  
//	    if(subject.isAuthenticated()){
//	    	System.out.println("登录成功");
//	    	Object primaryPrincipal1 = subject.getPrincipal();  
//	    	System.out.println(primaryPrincipal1);
//	    	PrincipalCollection princialCollection = subject.getPrincipals();  
//	    	System.out.println(princialCollection);
//	    	Object primaryPrincipal2 = princialCollection.getPrimaryPrincipal();
//	    }else{
//	    	System.out.println("登录失败");
//	    }
//	    
//	    //6、退出  
//	    subject.logout();
//	}
	
	
	@Test
	public void testHelloWorld(){
		//1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
		Factory<SecurityManager> factory =  
	            new IniSecurityManagerFactory("classpath:class6/shiro-multirealm.ini");
		//2、得到SecurityManager实例 并绑定给SecurityUtils  
	    SecurityManager securityManager = factory.getInstance();
	    SecurityUtils.setSecurityManager(securityManager);
	    //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
	    Subject subject  = SecurityUtils.getSubject();
	    UsernamePasswordToken token = new UsernamePasswordToken("wu", "123");
	    try {  
	        //4、登录，即身份验证  
	        subject.login(token);  
	    } catch (AuthenticationException e) {  
	        //5、身份验证失败  
	    }  
	    if(subject.isAuthenticated()){
	    	System.out.println("登录成功");
	    	Session session = subject.getSession();
	    	System.out.println("id");
	    	System.out.println();
	    }else{
	    	System.out.println("登录失败");
	    }
	    
	    //6、退出  
	    subject.logout();
	}
}
