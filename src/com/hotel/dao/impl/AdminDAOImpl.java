/**
 * 
 */
package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.bean.Admin;
import com.hotel.dao.AdminDAO;

/**
 * @author Hanwen
 *
 */
public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO {

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#saveAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void saveAdmin(Admin admin) {
		this.getHibernateTemplate().save(admin);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#findAllAdmin()
	 */
	@Override
	public List<Admin> findAllAdmin() {
		String queryString = "from Admin";
		List<Admin> list = (List<Admin>) this.getHibernateTemplate().find(queryString);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#removeAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void removeAdmin(Admin admin) {
		this.getHibernateTemplate().delete(admin);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#updateAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public void updateAdmin(Admin admin) {
		this.getHibernateTemplate().update(admin);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#findAdminById(java.lang.Integer)
	 */
	@Override
	public Admin findAdminById(Integer id) {
		Admin admin = (Admin) this.getHibernateTemplate().get(Admin.class, id);
		return admin;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.AdminDAO#loginAdmin(com.hotel.bean.Admin)
	 */
	@Override
	public Admin loginAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

}
