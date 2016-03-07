package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Room;

/**
 * @author Hanwen
 *
 */
public interface RoomDAO {
	
	/**
	 * 
	 * @Description 保存房间信息
	 * @param room
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void saveRoom (Room room);
	
	/**
	 * 
	 * @Description 查找所有房间
	 * @return
	 * @Return: List<Room>
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public List<Room> findAllRoom();
	
	/**
	 * 
	 * @Description 删除房间信息
	 * @param room
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void removeRoom (Room room);
	
	/**
	 * 
	 * @Description 更新房间信息
	 * @param room
	 * @Return: void
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public void updateRoom (Room room);
	
	/**
	 * 
	 * @Description 按id查找指定房间
	 * @param id
	 * @return
	 * @Return: Room
	 * @Author: Hanwen
	 * @Date: 2016年3月7日
	 */
	public Room findRoomById (Integer id);
}
