/**
 * 
 */
package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Order;
import com.hotel.bean.User;
import com.hotel.dao.OrderDAO;
import com.hotel.service.OrderService;

/**
 * @author Hanwen
 *
 */
public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO;
	/**
	 * @param orderDAO the orderDAO to set
	 */
	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#saveOrder(com.hotel.bean.Order)
	 */
	@Override
	public void saveOrder(Order order) {
		if(orderDAO.findOrderById(order.getOrderid()) == null) {
			orderDAO.saveOrder(order);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#findAllOrder()
	 */
	@Override
	public List<Order> findAllOrder() {
		return orderDAO.findAllOrder();
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#removeOrder(com.hotel.bean.Order)
	 */
	@Override
	public void removeOrder(Order order) {
		if(orderDAO.findOrderById(order.getOrderid()) != null) {
			orderDAO.removeOrder(order);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#updateOrder(com.hotel.bean.Order)
	 */
	@Override
	public void updateOrder(Order order) {
		if(orderDAO.findOrderById(order.getOrderid()) != null) {
			orderDAO.updateOrder(order);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#findOrderById(java.lang.Integer)
	 */
	@Override
	public Order findOrderById(Integer id) {
		
		return orderDAO.findOrderById(id);
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#getUserOrder(com.hotel.bean.User)
	 */
	@Override
	public List<Order> getUserOrder(User user) {
		
		return orderDAO.getUserOrder(user);
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.OrderService#findOrderByUseridAndRoomid(int, int)
	 */
	@Override
	public Order findOrderByUseridAndRoomid(int userid, int roomid) {

		return orderDAO.findOrderByUseridAndRoomid(userid, roomid);
	}

}
