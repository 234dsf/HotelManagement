package com.hotel.service;

import java.util.List;

import com.hotel.bean.Order;
import com.hotel.bean.User;

/**
 * @author Hanwen
 *
 */
public interface OrderService {
	
	/**
	 * 
	 * @Description 保存预定房间信息
	 * @param order
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void saveOrder (Order order);
	
	/**
	 * 
	 * @Description 查询所有预定订单
	 * @return
	 * @Return: List<Order>
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public List<Order> findAllOrder ();
	
	 /**
	  * 
	  * @Description 取消预定订单
	  * @param order
	  * @Return: void
	  * @Author: Hanwen
	  * @Date: 2016年3月7日
	  */
	public void removeOrder (Order order);
	
	/**
	 * 
	 * @Description 修改预定订单
	 * @param order
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void updateOrder (Order order);
	
	/**
	 * 
	 * @Description 按id查找指定预定订单
	 * @param id
	 * @return
	 * @Return: Order
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public Order findOrderById (Integer id);
	
	/**
	 * 
	 * @Description 查找指定用户的订单
	 * @param user
	 * @return
	 * @Return: List<Order>
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public List<Order> getUserOrder (User user);
	
	/**
	 * 
	 * @Description 按用户标识和房间号查找订单
	 * @param userid
	 * @param roomid
	 * @return
	 * @Return: Order
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public Order findOrderByUseridAndRoomid(int userid, int roomid);
	
}
