package com.hotel.bean;

public class Order {

	//订单号
	private int orderid;
	
	//用户号
	private int userid;
	
	//房间号
	private int roomid;
	
	//生成各个属性的getter和setter方法
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	
	
}
