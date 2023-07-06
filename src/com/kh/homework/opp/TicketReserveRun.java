package com.kh.homework.opp;

import java.util.Scanner;

import com.kh.day06.oop.member.Member;

public class TicketReserveRun {
//	public static void main(String[] args) {
//		Member [] memArrs = new Member[2];
//		finish : 
//		while(true) {
//			int choice;
//			switch(choice) {
//			case 1 : 
////				inputInfo(memArrs);
//				break;
//			case 2 : 
////				printInfo(memArrs);
//				break;
////			case 3 : 
////				ticketReserve();
////				break;
////			case 4 : 
////				printReserve();
////				break;
////			case 5 : 
////				memberGrade();
////				break;
//			case 6 : 
//				System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
//				System.out.println("		 프로그램이 종료되었습니다. ");
//				System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
//				break finish;
//			default : System.out.println("잘못입력하셨습니다. 다시 선택해주세요."); 
//			}
//			
//		}
//	}
	
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
	public void ticketReserve() {
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		         [티켓 예매] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
	}
	public void printReserve() {
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		      [예매 내역 확인] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
	}
	public void memberGrade() {
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
		System.out.println("		      [회원 등급 확인] ");
		System.out.println("■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ ■");
	}
	
	
	
	
	
	
	
}
