/**
 * 
 */
package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.bean.Room;
import com.hotel.dao.RoomDAO;

/**
 * @author Hanwen
 *
 */
public class RoomDAOImpl extends HibernateDaoSupport implements RoomDAO {

	/* (non-Javadoc)
	 * @see com.hotel.dao.RoomDAO#saveRoom(com.hotel.bean.Room)
	 */
	@Override
	public void saveRoom(Room room) {
		this.getHibernateTemplate().save(room);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.RoomDAO#findAllRoom()
	 */
	@Override
	public List<Room> findAllRoom() {
		String sql = "from Room";
		List<Room> list = (List<Room>)this.getHibernateTemplate().find(sql);
		
		return list;
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.RoomDAO#removeRoom(com.hotel.bean.Room)
	 */
	@Override
	public void removeRoom(Room room) {
		this.getHibernateTemplate().delete(room);
	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.RoomDAO#updateRoom(com.hotel.bean.Room)
	 */
	@Override
	public void updateRoom(Room room) {
		this.getHibernateTemplate().update(room);

	}

	/* (non-Javadoc)
	 * @see com.hotel.dao.RoomDAO#findRoomById(java.lang.Integer)
	 */
	@Override
	public Room findRoomById(Integer id) {
		Room room = (Room)this.getHibernateTemplate().get(Room.class, id);
		return room;
	}

}
