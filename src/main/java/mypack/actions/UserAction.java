package mypack.actions;

import com.basics.login.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

import mypack.bean.User;

public class UserAction  extends ActionSupport {
	
	private User  user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		if(user != null ) {
			if(user.getFname().length() == 0 && user.getFname().isEmpty()) {
				addFieldError("fname","First is required");
			}
			if(user.getLname().length() == 0 && user.getFname().isEmpty()) {
				addFieldError("lname","Last is required");
			}
			
			boolean status =false;
			status = LoginDAO.register(user.getFname(), user.getLname(), user.getAge(), user.getbGroup(), user.isSex(), user.getSalary(), user.getId());
			if(status) {
				return "success";
			}
		}
		return "success";
	}
	
	
}
