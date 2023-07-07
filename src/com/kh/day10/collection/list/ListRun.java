package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for(int i = 0; i <sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
		
		
		
	}
	public void sListExample() {
		// list 쓰고 ctrl + space bar하면 java.util 선택 -> List<E> 나옴 
		List<String> strList = new ArrayList<String>(); 
		// 인터페이스는 객체 생성이 안 됨 인터페이스를 상속한걸로 객체 생성해서 사용 
		// 부모타입의 변수로 자식 객체를 다루고 이것은 업캐스팅 
		// ArrayList<String> aList = new ArrayList<String>(); 
		//ㄴ이렇게 써도 되긴 함 ! 하지만 나중을 위해서 위처럼 씀
		
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		System.out.println("====================================");
		strList.add(2, "체리"); // 중간에 추가! 
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		strList.set(2, "파인애플"); // 중간에 있는 값 수정 
		System.out.println("====================================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		strList.remove(2);  // 중간에 있는 값 삭제 
		System.out.println("====================================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
	}
	
	public void genericExample() {
		// RList<Object> list = new RList<Object>();
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);	
	}
	
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		Object obj = objList.get(0);  // int, String 등으로 하면 다른 걸 못받아서 Object로 함 
		
		// int num = obj; 
		// Type mismatch: cannot convert from Object to int 
		// 다운캐스팅 해줘야 함 
		int num = (int)obj;
		
		Object obj2 = objList.get(1);
		// String str = obj2;
		// Type mismatch: cannot convert from Object to String
		String str = (String)obj2;
		
		// char cOne = objList.get(2);
		// Type mismatch: cannot convert from Object to char
		char cOne = (char)objList.get(2);
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(cOne);
		
	}

	public void intExample() {
//		int [] nums = new int[3];
		IntList nums = new IntList();
//		nums[0] = 1;
		// 배열은 인덱스가 있지만 컬렉션은 인덱스 신경쓰지 않고 값 넣음 
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		int result = nums[0];
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		nums = {};, nums = new int[3];
		nums.clear();
	}
	
}
