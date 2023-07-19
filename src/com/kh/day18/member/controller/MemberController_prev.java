package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController_prev {
	private List<Member> mList;
	private MemberView view;
	
	public MemberController_prev() { // 생성자로 초기화
		view = new MemberView(); 
		mList = new ArrayList<Member>();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = 0;
		end : 
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 : 
				mOne = view.inputMember();
				addMember(mOne);
				break;
			case 2 : 
				name = view.inputMemberName();  // 수정할 데이터의 이름을 입력 받음.
				index = findIndexByName(name);  // 인덱스값을 찾음.
				mOne = findOneByName(name);     // 수정하지 않는 부분은 기존 데이터 유지되도록 정보를 불러옴
				if(index != -1) {
					mOne = view.modifyMember(mOne); // 데이터가 있을 때 수정할 정보 입력 받음.
				}									// 수정된 데이터(mOne)
				modifyMember(index, mOne);			// 데이터 수정하기
				break;
			case 3 : 
				name = view.inputMemberName();   // 삭제할 데이터의 이름을 입력 받음.
				index = findIndexByName(name);
				if(index != -1) {
					subMember(mOne);		     // 데이터 삭제하기 					
				}
				break;
			case 4 : 
				name = view.inputMemberName();
				mOne = findOneByName(name);
				view.printOneMember(mOne);
				break;
			case 5 : 
				// 전체출력 
				view.printAllMembers(allMemberList()); 
				break;
			case 6 : 
				break end;
			}
			// 회원관리프로그램
			// 1. 회원 정보 등록
			// 2. 회원 정보 수정
			// 3. 회원 정보 삭제
			// 4. 회원 정보 출력(이름)
			// 5. 회원 전체 정보 출력
		}
	}
	
	/** 
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index값 
	 * @param mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	/**
	 * 이름으로 인덱스 찾기
	 * @param name String으로 입력 받은 값
	 * @return int값 리턴, 없으면 -1 리턴
	 */
	public int findIndexByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1; // 못찾았으면 없다고 -1 리턴 
	}
	
	/**
	 * 이름으로 회원정보 찾기 
	 * @param name String으로 입력 받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
//				view.printOneMember(mList.get(i));
				 // 메소드를 이용해 출력하는 걸로 바꿈 
//				System.out.println(mList.get(i));
			}
		}
		return null;   // 다 돌았는데도 없으면 return null; 
	}
	
	/**
	 *  회원 전체 정보 조회
	 * @return 전체 회원 정보 리턴
	 */
	public List<Member> allMemberList() {
		return mList;
	}
	
	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	} // 입력받은 걸 디비쪽으로 보내주는 메소드 
	
	/**
	 * 회원 정보 삭제
	 * @param member
	 */
	public void subMember(Member member) {
		mList.remove(member);
	}
	
}
