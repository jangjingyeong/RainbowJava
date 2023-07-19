package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController {
//	private List<Member> mList;
//	private MemberView view;
	private MemberDAO memberDao;
	
	public MemberController() { // 생성자로 초기화
//		view = new MemberView(); 
//		mList = new ArrayList<Member>();
		memberDao = new MemberDAO();
	}
	

	/**
	 * 이름으로 인덱스 찾기
	 * @param name 
	 * @return 
	 */
	public int findIndexByName(String name) {
		int index = memberDao.findIndexByName(name);
		return index;
	}
	
	/**
	 * 이름으로 회원정보 찾기 
	 * @param name 
	 * @return 
	 */
	public Member findOneByName(String name) {
		return memberDao.findOneByName(name);
	}
	
	/**
	 *  회원 전체 정보 조회
	 * @return 전체 회원 정보 리턴
	 */
	public List<Member> allMemberList() {
		return memberDao.allMemberList();
	}
	
	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		memberDao.addMember(member);
	} // 입력받은 걸 디비쪽으로 보내주는 메소드 
	
	/** 
	 * 회원 정보 수정
	 * @param index 이름으로 찾은 index값 
	 * @param mOne 수정된 정보(데이터)
	 */
	public void modifyMember(int index, Member mOne) {
		memberDao.modifyMember(index, mOne);
	}

	/**
	 * 회원 정보 삭제
	 * @param member
	 */
	public void subMember(Member member) {
		memberDao.subMember(member);
	}
	
	
}