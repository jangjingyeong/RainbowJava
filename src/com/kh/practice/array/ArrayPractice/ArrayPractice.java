package com.kh.practice.array.ArrayPractice;

import java.util.Scanner;

public class ArrayPractice {
	// 자바 배열 실습문제 12문제 
	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int [] arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = i+1;
			System.out.print(arrs[i] + " ");
		}
	}

	public void practice2() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int [] arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = i+1;
			System.out.print(arrs[i] + " ");
		}
	}

	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		// 1. 배열 생성 
		int [] arrs = new int[10]; 
		// 2. 입력 받기
		Scanner sc = new Scanner(System.in);
		// 3. 입력된 값을 배열에 초기화
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			arrs[i] = sc.nextInt();
		} 
		System.out.print("양의 정수 : " + arrs.length);
		// 4. 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
	}
	
	public void practice4() {
		// 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		// 배열 인덱스를 활용해서 귤을 출력하세요.
//		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		String [] fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		// 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		
	}
	
	public void practice6() {
		// “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		
	}
	
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
