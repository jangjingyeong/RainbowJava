package com.kh.day17.exercise.opp.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.exercise.opp.motel.domain.vo.Room;

public class MotelController {
	
//	List<Room> rList;
	List<Boolean> rList;
	
	public MotelController() {
//		rList = new ArrayList<Room>();
		rList = new ArrayList<Boolean>();
		for(int i = 0; i < 10; i++) {
//			rList.add(new Room());
			rList.add(false);
		}
	}
	
	
	public List<Boolean> getAllRooms() {
		return rList;
	}

	public Boolean checkRoomState(int chosenRoom) {
		return rList.get(chosenRoom-1);
	}
	
	public Boolean checkIn(Boolean room, int roomNo) {
		if(!room) 
			rList.set(roomNo-1, true);
		return room;
	}
	
	public Boolean checkOut(Boolean room, int chosenRoom) {
		if(room)
			rList.set(chosenRoom-1, false);
		return room;
	}
	
	
	
//	
//	public void printAllRooms() {
//		for(int i = 0; i < rList.size(); i++) {
////			if(rooms[i] == 0) {
//			if(!rList.get(i)) {
//				System.out.println((i+1) + "번 방이 현재 비어 있습니다.");						
//			} else {
//				System.out.println((i+1) + "번 방에는 현재 손님이 있습니다.");
//			}
//		}
//	}
//	
//	public Boolean checkOut(Boolean room, int chosenRoom) {
//		if(room)
//			rList.set(chosenRoom-1, false);
//		return room;
//	}
//	
//	public void checkIn(int roomNo) {
//		if(roomNo > 0 && roomNo <= 10) {
////			Room room = rList.get(roomNo-1);
//			Boolean room = rList.get(roomNo-1);
////			if(!room.isAvailable()) { // 비어있으면 입실 
//			if(!room) {
////				room.setAvailable(true);	
//				rList.set(roomNo-1, true);
//				System.out.println(roomNo + "번 방에 입실하셨습니다.");						
//			} else {
//				System.out.println(roomNo + "번 방은 현재 손님이 있습니다.");
//			}
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("1번방부터 10번방까지 준비되어 있습니다.");
//		}
//	}
//	
//	
//	public void checkOut(int chosenRoom) {
//		if(chosenRoom > 0 && chosenRoom <= 10) {
//			Boolean room = rList.get(chosenRoom-1);
//			if(room) { 
//				rList.set(chosenRoom-1, false);							
//				System.out.println(chosenRoom + "번 방에서 퇴실하셨습니다.");
//			} else {
//				System.out.println(chosenRoom + "은 현재 빈 방입니다.");
//			}
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("1번방부터 10번방까지 준비되어 있습니다.");
//		}
//	}
//	
	
	
	
	
	
	
}
