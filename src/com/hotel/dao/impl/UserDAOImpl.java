/**
 * 
 */
package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.bean.User;
import com.hotel.dao.UserDAO;

/**
 * @author Hanwen
 *
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#saveUser(com.hotel.bean.User)
	 */
	@Override
	public void saveUser(User user) {
		this.getHibernateTemplate().save(user);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#findAllUers()
	 */
	@Override
	public List<User> findAllUers() {
		String sql = "from User";
		List<User> list = (List<User>)this.getHibernateTemplate().find(sql);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#removeUser(com.hotel.bean.User)
	 */
	@Override
	public void removeUser(User user) {
		this.getHibernateTemplate().delete(user);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#updateUser(com.hotel.bean.User)
	 */
	@Override
	public void updateUser(User user) {
		this.getHibernateTemplate().update(user);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#findUserById(java.lang.Integer)
	 */
	@Override
	public User findUserById(Integer id) {
		User user = (User)this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.UserDAO#loginUser(com.hotel.bean.User)
	 */
	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
