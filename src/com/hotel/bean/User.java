package com.hotel.bean;

public class User {
	//用户号
	private int userid;
	
	//用户名
	private String username;
	
	//密码
	private String password;
	
	//手机号
	private String mobile;
	
	//邮箱
	private String email;

	//生成各个属性的getter和setter方法
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
