package com.kh.homework.opp;

import java.util.Scanner;

public class TicketReserveFunction {
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		    [티켓 예매 프로그램] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		
		System.out.println("1. 회원 정보 입력 ");
		System.out.println("2. 회원 정보 출력 ");
		System.out.println("3. 티켓 예매");
		System.out.println("4. 예매 내역 확인");
		System.out.println("5. 회원 등급 확인");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		      [회원 정보 입력] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("핸드폰번호(010-0000-0000) : ");
		String phone = sc.next();
	}
	public void printInfo() {
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		      [회원 정보 출력] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
//		System.out.println("이름 : " + name);
//		System.out.println("이메일 : " + email);
//		System.out.println("핸드폰번호 : " + phone);
	}
	
	
	
	
	
	
	
	
}
