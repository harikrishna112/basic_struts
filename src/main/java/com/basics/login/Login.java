package com.basics.login;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class Login implements SessionAware {
	
	private String username,password;
	private SessionMap<String, String> sessionMap;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map session) {
	sessionMap = (SessionMap<String, String>) session;
	sessionMap.put("login", "true");
	}
	
	public String execute() {
		if(LoginDAO.validate(username,password)) 
			return "success";
		
		return "error";
	}
	
	public String logout() {
		sessionMap.invalidate();
		return "success";
	}

}
