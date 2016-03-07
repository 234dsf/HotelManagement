package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Admin;

import javassist.bytecode.Descriptor;


public interface AdminDAO {
	
	/**
	 * 
	 * @Description 保存客户信息
	 * @param admin
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void saveAdmin(Admin admin);
	
	/**
	 * 
	 * @Description 查找所有管理员信息
	 * @return
	 * @Return: List<Admin>
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public List<Admin> findAllAdmin();
	
	/**
	 * 
	 * @Description 删除管理员信息
	 * @param admin
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void removeAdmin(Admin admin);
	
	/**
	 * 
	 * @Description 更新管理员信息
	 * @param admin
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void updateAdmin(Admin admin);
	
	/**
	 * 
	 * @Description 按id查找指定管理员
	 * @param id
	 * @return
	 * @Return: Admin
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public Admin findAdminById(Integer id);
	
	/**
	 * 
	 * @Description 管理员登录
	 * @param admin
	 * @return
	 * @Return: Admin
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public Admin loginAdmin(Admin admin);
	
}
