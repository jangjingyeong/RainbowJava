package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		Member [] memArrs = new Member[3];
		finish : 
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				inputInfo(memArrs);
				break;
			case 2 : 
				printInfo(memArrs);
				break;
			case 3 : 
				memberGrade(memArrs);
				break;
			case 4 : 
				System.out.println("프로그램이 종료되었습니다."); 
				break finish;			
			default : System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
			}	
		}
	}

	
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 고객 등급 확인 프로그램 ===");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 출력");
		System.out.println("3. 고객 등급 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}



	private static void inputInfo(Member[] memArrs) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println("=== 1. 고객 정보 입력 ===");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("주문 건수 : ");
			int buyTotal = sc.nextInt();
			System.out.print("주문 금액 : ");
			int buyAmount = sc.nextInt();
			memArrs[i] = new Member();
			memArrs[i].setName(name);
			memArrs[i].setBuyTotal(buyTotal);
			memArrs[i].setBuyAmount(buyAmount);
		}
	}
	
	private static void printInfo(Member[] memArrs) {
		System.out.println("=== 2. 고객 정보 출력 ===");
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println(memArrs[i].getName() + "고객님의 주문 건수는 " 
			+ memArrs[i].getBuyTotal() + "건, 주문 금액은 " 
			+ memArrs[i].getBuyAmount() + "원입니다.");			
		}
	}

	private static void memberGrade(Member[] memArrs) {
		System.out.println("=== 3. 고객 등급 출력 ===");
		for(int i = 0; i < memArrs.length; i++) {
			System.out.print(memArrs[i].getName() + "님의 등급은 ");
			if(memArrs[i].getBuyTotal() >= 20 && memArrs[i].getBuyAmount() >= 1000000) {
				System.out.println("VVIP 입니다.");			
			} else if (memArrs[i].getBuyTotal() >= 3 && memArrs[i].getBuyAmount() >= 300000) {
				System.out.println("VIP 입니다.");	
			} else if (memArrs[i].getBuyTotal() >= 1 && memArrs[i].getBuyAmount() >= 30000) {
				System.out.println("FAMILY 입니다.");	
			} else {
				System.out.println("WELCOME 입니다.");	
			}
		}
	}



}
