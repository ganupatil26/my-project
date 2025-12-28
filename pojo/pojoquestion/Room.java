package com.pojoquestion;

public class Room {
//	Room → roomNo, type
	int roomNo;
	String type;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(int roomNo, String type) {
		super();
		this.roomNo = roomNo;
		this.type = type;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", type=" + type + "]";
	}
	
}
