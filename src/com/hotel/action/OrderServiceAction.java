/**
 * 
 */
package com.hotel.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hanwen
 *
 */
public class OrderServiceAction extends ActionSupport {

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
	//获取用户所预定的房间
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		List<Order> orders = this.orderService.getUserOrder(user);
		
		List<Room> rooms = new ArrayList<Room>();
		if(orders.size() > 0) {
			for(Order order : orders) {
				rooms.add((Room)this.roomService.findRoomById(order.getRoomid()));
			}
		}
		
		Map requestList = (Map) ActionContext.getContext().get("request");
		requestList.put("listUserRoom", rooms);
		return SUCCESS;
		
	}
	

	
	//退订
	public String delete () {
		
		String message = "";
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		Room room = new Room();
		
		Order order = this.orderService.findOrderByUseridAndRoomid(user.getUserid(), room.getRoomid());
		this.orderService.removeOrder(order);
		
		Room roomUser = this.roomService.findRoomById(room.getRoomid());
		roomUser.setStatus(0);
		this.roomService.updateRoom(roomUser);
		message = "退订房间成功";
		return "delSuc";
	}
	
	
	
	
	
	
	
	
	
	
	
}
