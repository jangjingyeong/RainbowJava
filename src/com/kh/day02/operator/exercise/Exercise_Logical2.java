package com.kh.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args)
	{
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 변수 word에 초기화
		// 영어 대문자 확인 : true
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
//		String words = sc.next();
//		System.out.println("문자열 확인 : " + words);
		char word = sc.next().charAt(0); 
		// 첫번째 인덱스에 있는 문자 잘라서 넣겠다 -> 문자열에서 문자가 됨 
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}
}
