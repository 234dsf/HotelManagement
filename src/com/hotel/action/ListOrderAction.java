package com.hotel.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hanwen
 *
 */
public class ListOrderAction extends ActionSupport {

	private RoomService roomService;
	
	private OrderService orderService;
	/**
	 * @param orderService the orderService to set
	 */
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	/**
	 * @param roomService the roomService to set
	 */
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		List<Order> orders = this.orderService.findAllOrder();
		
		//将所有用户预定房间信息存入rooms
		List<Room> rooms = new ArrayList<Room> ();
		if(orders.size() > 0) {
			for(Order order : orders) {
				rooms.add((Room)this.roomService.findRoomById(order.getRoomid()));
			}
		}
		
		//将rooms保存到listAllRoom中，rooms中存放所有用户预定房间的信息
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listAllRoom", rooms);
		
		return SUCCESS;
	}
	
	
	
}
