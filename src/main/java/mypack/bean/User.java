package mypack.bean;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
@Validations
public class User extends ActionSupport{
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
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
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
	public Date getMember_created_date() {
		return member_created_date;
	}
	public void setMember_created_date(Date member_created_date) {
		this.member_created_date = new Date(0);
	}
	@Override
	public String toString() {
		return "User [sessionMap=" + sessionMap + ", fname=" + fname + ", message=" + message + ", lname=" + lname
				+ ", age=" + age + ", bGroup=" + bGroup + ", sex=" + sex + ", salary=" + salary + ", id=" + id
				+ ", member_created_date=" + member_created_date + "]";
	}
	
	
	public boolean validate(HttpServletRequest request) {
		boolean isUserError = false;
		if(this.getFname().length() == 0) {
			isUserError = true;
			addFieldError("fname", "firstname is required");
		}
		if(this.getLname().length() ==0) {
			isUserError = true;
			addFieldError("lname", "last name is required");
		}
		return isUserError;
	}
	
	

}
