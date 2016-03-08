/**
 * 
 */
package com.hotel.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hanwen
 *
 */
public class SaveOrderAction extends ActionSupport {
	
	private RoomService roomService;
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
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("listRoom", this.roomService.findAllRoom());
		return SUCCESS;
	}
	
	private Room room;
	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}
	
	private Order order;
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	
	public String add () {
		String message = "";
		
		Room roomUser = this.roomService.findRoomById(room.getRoomid());
		
		if(roomUser.getStatus() == 0) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			
			User user = (User)session.getAttribute("user");
			order.setUserid(user.getUserid());
			roomUser.setStatus(1);
			this.roomService.updateRoom(roomUser);
			return "addSuc";
		}
		else {
			message = "该房间已经有客人入住了。";
			return "addFail";
		}
	}
	
	
}
