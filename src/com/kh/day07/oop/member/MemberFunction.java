package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	private Member [] memArrs;  // 멤버변수 
	private int index;
	
	public MemberFunction() {
		 memArrs = new Member[3]; // 생성자로 멤버변수 초기화 
		 index = 0;
	}
	
	public int printMenu() {
		// 회원관리프로그램
		// 1. 회원정보입력
		// 2. 회원정보출력
		// 3. 프로그램종료
		// 메뉴 입력 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리프로그램 ======");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() { // 소괄호 안에 Member[] memArrs를 전달 받아 쓸 필요없음 
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 1. 회원정보입력 ======");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); 
		String memberAddress = sc.nextLine(); 
		memArrs[index] = new Member(memberId, memberPw, memberEmail, memberAddress);
		index++;
	}
	
	public void printInfo() {
		System.out.println("====== 2. 회원정보출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n"
					, memArrs[i].getMemberId(), memArrs[i].getMemberPw()
					, memArrs[i].getMemberEmail(), memArrs[i].getMemberAddress());
		}
	}
}