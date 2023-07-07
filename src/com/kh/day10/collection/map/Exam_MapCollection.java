package com.kh.day10.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.day10.collection.student.Student;

public class Exam_MapCollection {
	public static void main(String[] args) {
		Map<String, Student> stdMap = new HashMap<String, Student>();
		stdMap.put("one", new Student("타이타닉", 44, 66));
		stdMap.put("two", new Student("자바", 88, 44));
		
		System.out.println("첫번째 학생 : " + stdMap.get("one"));
		System.out.println("첫번째 학생 : " + stdMap.get("two"));
		
		
		// 이건 예제 
//		String number = "02";
//		if(number.equals("02")) {
//			System.out.println("서울입니다.");
//		}
	}
	public void mapExample2() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "손풍기");
		objMap.put("price", 1500);
		objMap.put("isGood", true);
		System.out.println("상품 이름은 " + (String)objMap.get("name"));
		// 변수에 넣는 것 아니면 String 생략 가능 -> 자동 형변환
		System.out.println("가격은 " + objMap.get("price"));
		String result = (boolean)objMap.get("isGood") ? "추천" : "비추천";
		// Type mismatch: cannot convert from Object to boolean
		// boolean형으로 강제형변환
		System.out.println("추천 여부는 " + result);
	}
	public void mapExample1() {
Map<String, String> map = new HashMap<String, String>();
		
		map.put("02","서울");
		map.put("031","경기도");
		map.put("061","전라도");
		map.put("053","대구");
		System.out.println("저장된 데이터의 수 : " + map.size());
		System.out.println("02를 누르면 서울이 나옵니다 : " + map.get("02"));
		System.out.println("031를 누르면 경기도가 나옵니다 : " + map.get("031"));
		System.out.println("061를 누르면 전라도가 나옵니다 : " + map.get("061"));
		System.out.println("053를 누르면 대구가 나옵니다 : " + map.get("053"));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력 : ");
		String regionCode = sc.next();
		System.out.println("입력하신 지역번호에 대한 지역은 : " + map.get(regionCode));
		
	}
	
}
