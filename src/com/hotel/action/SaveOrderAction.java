/**
 * 
 */
package com.hotel.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Hanwen
 *
 */
public class SaveOrderAction extends ActionSupport {
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("listRoom", this.roomService.findAllRoom());
		return SUCCESS;
	}
	
	public String add () {
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
