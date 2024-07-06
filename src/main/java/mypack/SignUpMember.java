package mypack;

import java.sql.Date;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.basics.login.LoginDAO;

public class SignUpMember implements SessionAware{
	
	private SessionMap<String, Object> sessionMap;
	
	private String fname, message;
	private String lname;
	private int age;
	private String bGroup;
	private boolean sex;
	private double salary;
	private long id;
	private Date member_created_date;
	
	
	
	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}
	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMessage() {  
	    return message;  
	}  
	public void setMessage(String message) {  
	    this.message = message;  
	}  
	
	public Date getMember_created_date() {
		return member_created_date;
	}
	public void setMember_created_date(Date member_created_date) {
		this.member_created_date = member_created_date;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLnmae(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getbGroup() {
		return bGroup;
	}
	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String execute() {
		System.out.println("calling the rigister_DB  method from Signup JAVA");
		if (LoginDAO.register(getFname(), getLname(), getAge(), getbGroup(), isSex(), getSalary(), getId())) {
			System.out.println("member inserted successfully.");
			return "success";
		}
		return "success";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;
		sessionMap.put("Register", "true");
	}
	
}

