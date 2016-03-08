/**
 * 
 */
package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Room;
import com.hotel.dao.RoomDAO;
import com.hotel.service.RoomService;

/**
 * @author Hanwen
 *
 */
public class RoomServiceImpl implements RoomService {

	private RoomDAO roomDAO;
	/**
	 * @param roomDAO the roomDAO to set
	 */
	public void setRoomDAO(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}
	
	/* (non-Javadoc)
	 * @see com.hotel.service.RoomService#saveRoom(com.hotel.bean.Room)
	 */
	@Override
	public void saveRoom(Room room) {
		if(roomDAO.findRoomById(room.getRoomid()) == null) {
			roomDAO.saveRoom(room);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.RoomService#findAllRoom()
	 */
	@Override
	public List<Room> findAllRoom() {
		
		return roomDAO.findAllRoom();
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.RoomService#removeRoom(com.hotel.bean.Room)
	 */
	@Override
	public void removeRoom(Room room) {
		if(roomDAO.findRoomById(room.getRoomid()) != null) {
			roomDAO.removeRoom(room);
		}

	}

	/* (non-Javadoc)
	 * @see com.hotel.service.RoomService#updateRoom(com.hotel.bean.Room)
	 */
	@Override
	public void updateRoom(Room room) {
		if(roomDAO.findRoomById(room.getRoomid()) != null) {
			roomDAO.updateRoom(room);
		}
	}

	/* (non-Javadoc)
	 * @see com.hotel.service.RoomService#findRoomById(java.lang.Integer)
	 */
	@Override
	public Room findRoomById(Integer id) {
		
		return roomDAO.findRoomById(id);
	}

}
