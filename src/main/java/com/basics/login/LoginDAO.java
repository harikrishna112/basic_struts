package com.basics.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import mypack.SignUpMember;

public class LoginDAO {
	
	private static String username="hari_admin";
	private static String password="admin";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String driverName="oracle.jdbc.driver.OracleDriver";
	private static String query=null;
	private static Connection connection = null;

	public static boolean validate(String username, String password) {
		boolean status = false;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
			query="select NAME, password from loginUser where name=? and password=?";
			PreparedStatement psmt = connection.prepareStatement(query);
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				String usernameDB = rs.getString("NAME");
				System.out.println("print DB Values username : "+usernameDB);
				String passwordDB =rs.getString("PASSWORD");
				System.out.println("print DB Values passwordDB : "+passwordDB);
			if(usernameDB.equals(username) && passwordDB.equals(password)) {
				status =true;
				return status;
			}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return status;
	}
	
	public static boolean register(String fname, String lname, int age, String bGroup, boolean sex, double salary,
			long id) {
		boolean status = false;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, username, password);
			query = "Insert into Register_User(fname,lname,age,bGroup,sex,salary,id,member_created_date) Values(?,?,?,?,?,?,?,?)";
			java.util.Date newDate = new Date();
			SignUpMember  member = new SignUpMember();
			PreparedStatement psmt = connection.prepareStatement(query);
			psmt.setString(1, fname);
			psmt.setString(2, lname);
			psmt.setInt(3, age);
			psmt.setString(4, bGroup);
			psmt.setBoolean(5, sex);
			psmt.setDouble(6, salary);
			psmt.setLong(7, id);
			psmt.setDate(8,member.getMember_created_date());
			ResultSet rs = psmt.executeQuery();
			System.out.println("user Registered successfully  :" + rs);
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

}

