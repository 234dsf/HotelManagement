package com.hotel.action;

import java.util.Iterator;
import java.util.List;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hanwen
 *
 */
public class LoginAction extends ActionSupport {
	
	private UserService userService;
	
	private String username;
	private String password;
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
	
	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		
		List<User> list = (List<User>)userService.findAllUers();
		
		User u = new User();
		Iterator<User> it = list.iterator();
		
		//检查用户信息是否已存在于数据库中
		while(it.hasNext()){
			u = (User)it.next();
			if(username.trim().equals(u.getUsername()) && password.trim().equals(u.getPassword())) {
				return SUCCESS;
			}
			else {
				return "failer";
			}
		}
		String page = "failer";
		return page;
		
		
		
		
		
		
		
	}
	
}
