package com.struts.basics;

public class ValidateUser {
	
	private String user_name;
	private String password;
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
	if(this.getUser_name().equals("hari_admin") && this.getPassword().equals("admin")) {
		return "SUCCESS";
	}else {
		return "FAILURE";
	}
  }
}
