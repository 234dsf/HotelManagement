/**
 * 
 */
package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Admin;
import com.hotel.dao.AdminDAO;
import com.hotel.service.AdminService;

/**
 * @author Hanwen
 *
 */
public class AdminServiceImpl implements AdminService {

	private AdminDAO adminDAO;
	
	/**
	 * @param adminDAO the adminDAO to set
	 */
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
	
	
	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#saveAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void saveAdmin(Admin admin) {
		if(adminDAO.findAdminById(admin.getAdminid()) == null) {
			adminDAO.saveAdmin(admin); 
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#findAllAdmin()
	 */
	@Override
	public List<Admin> findAllAdmin() {
		return adminDAO.findAllAdmin();
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#removeAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void removeAdmin(Admin admin) {
		if(adminDAO.findAdminById(admin.getAdminid()) != null) {
			adminDAO.removeAdmin(admin);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#updateAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void updateAdmin(Admin admin) {
		if(adminDAO.findAdminById(admin.getAdminid()) != null) {
			adminDAO.updateAdmin(admin);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#findAdminById(java.lang.Integer)
	 */
	@Override
	public Admin findAdminById(Integer id) {
		return adminDAO.findAdminById(id);
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.AdminService#loginAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
