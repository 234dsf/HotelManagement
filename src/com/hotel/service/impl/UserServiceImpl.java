/**
 * 
 */
package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.User;
import com.hotel.dao.UserDAO;
import com.hotel.service.UserService;

/**
 * @author Hanwen
 *
 */
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	/**
	 * @param userDAO the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#saveUser(com.hotel.bean.User)
	 */
	@Override
	public void saveUser(User user) {
		if(userDAO.findUserById(user.getUserid()) == null) {
			userDAO.saveUser(user);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#findAllUers()
	 */
	@Override
	public List<User> findAllUers() {
		return userDAO.findAllUers();
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#removeUser(com.hotel.bean.User)
	 */
	@Override
	public void removeUser(User user) {
		if(userDAO.findUserById(user.getUserid()) != null) {
			userDAO.removeUser(user);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#updateUser(com.hotel.bean.User)
	 */
	@Override
	public void updateUser(User user) {
		if(userDAO.findUserById(user.getUserid()) != null) {
			userDAO.updateUser(user);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#findUserById(java.lang.Integer)
	 */
	@Override
	public User findUserById(Integer id) {
		return userDAO.findUserById(id);
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.UserService#loginUser(com.hotel.bean.User)
	 */
	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
