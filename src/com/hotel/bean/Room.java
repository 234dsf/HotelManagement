package com.hotel.bean;

public class Room {
	
	//房间号
	private int  roomid;
	//房间名称
	private String name;
	//房间价格
	private double price;
	//房间类别
	private String category; 
	//房间状态
	private int status;
	
	//各个属性的getter和setter方法
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
}
