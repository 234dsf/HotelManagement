package com.hotel.service;

import java.util.List;

import com.hotel.bean.User;

/**
 * @author Hanwen
 *
 */
public interface UserService {

	/**
	 * 
	 * @Description 保存客户信息
	 * @param user
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void saveUser (User user);
	
	/**
	 * 
	 * @Description 查找所有客户
	 * @return
	 * @Return: List<User>
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public List<User> findAllUers();
	
	/**
	 * 
	 * @Description 删除客户信息
	 * @param user
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void removeUser (User user);
	
	/**
	 * 
	 * @Description 修改客户信息
	 * @param user
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void updateUser (User user);
	
	/**
	 * 
	 * @Description 按id值查找指定客户
	 * @param id
	 * @return
	 * @Return: User
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public User findUserById (Integer id);
	
	/**
	 * 
	 * @Description 客户登录
	 * @param user
	 * @return
	 * @Return: User
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public User loginUser (User user);
	
}
