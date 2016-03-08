/**
 * 
 */
package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.bean.Order;
import com.hotel.bean.User;
import com.hotel.dao.OrderDAO;

/**
 * @author Hanwen
 *
 */
public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO {

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#saveOrder(com.hotel.bean.Order)
	 */
	@Override
	public void saveOrder(Order order) {
		this.getHibernateTemplate().save(order);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#findAllOrder()
	 */
	@Override
	public List<Order> findAllOrder() {
		String sql = "from Order";
		List<Order> list = this.getHibernateTemplate().find(sql);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#removeOrder(com.hotel.bean.Order)
	 */
	@Override
	public void removeOrder(Order order) {
		this.getHibernateTemplate().delete(order);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#updateOrder(com.hotel.bean.Order)
	 */
	@Override
	public void updateOrder(Order order) {
		this.getHibernateTemplate().update(order);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#findOrderById(java.lang.Integer)
	 */
	@Override
	public Order findOrderById(Integer id) {
		Order order = (Order)this.getHibernateTemplate().get(Order.class, id);
		return order;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#getUserOrder(com.hotel.bean.User)
	 */
	@Override
	public List<Order> getUserOrder(User user) {
		String sql = "from Order o where o.userid='" + user.getUserid() + "'";
		List<Order> list = this.getHibernateTemplate().find(sql);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.OrderDAO#findOrderByUseridAndRoomid(int, int)
	 */
	@Override
	public Order findOrderByUseridAndRoomid(int userid, int roomid) {
		String sql = "from Order o where o.userid='" + userid +"' and o.roomid='" + roomid +"'";
		Order order = (Order) this.getHibernateTemplate().find(sql);
		return order;
	}

}
