package com.shiro.class10.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;

public class MySessionListener2 extends SessionListenerAdapter{

	//会话创建时触发  
	@Override
	public void onStart(Session session) {
		// TODO Auto-generated method stub
		System.out.println("MySessionListener2会话创建：" + session.getId());
		super.onStart(session);
	}

}
