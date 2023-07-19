package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;

public class MemberDAO {
	// DB에 해당하는 부분이 이쪽으로 넘어오게 됨 
	private List<Member> mList;
	
	public MemberDAO() {
		mList = new ArrayList<Member>();
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
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index값 
	 * @param mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	/**
	 * 회원 정보 삭제
	 * @param member
	 */
	public void subMember(Member member) {
		mList.remove(member);
	}
}
