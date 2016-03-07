package com.hotel.bean;

public class Admin {
	
	//管理员标识
	private int adminid;
	//管理员用户名
	private String username;
	//管理员密码
	private String password;
	
	//各个属性的getter和setter方法
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
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
	
	
}
