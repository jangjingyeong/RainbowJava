package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {
	public static void main(String[] args) {
		int num = 0;
		Integer su = Integer.valueOf(0); // new Interger 쓰지 않음 
		// 메소드가 기울어져있따 static 메소드  
//		su = null;  // null체크 가능 
		
		// The constructor Integer(int) has been deprecated since version 9 and marked for removal
		// 해당 기능은 없어져서 쓰지 말아라 su = new Integer(0); -> Integer에 취소선 생김 
		// su = new Integer(0); 
		
		// 박싱과 언박싱 
		su = Integer.valueOf(1026);
		// Integer.valueOf 귀찮으니 숫자 넣어도 되게 해달라 아래  
		su = 1026; // 오토-박싱 
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱 
		
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('A'));
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}
}
