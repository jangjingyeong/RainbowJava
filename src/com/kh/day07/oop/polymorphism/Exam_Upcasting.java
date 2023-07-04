package com.kh.day07.oop.polymorphism;

public class Exam_Upcasting {
	public static void main(String [] args) {
		Student std = new Student();
		Person p = new Person();
		
		Person parent = new Student("일용자");
		// 업캐스팅
		System.out.println(parent.name);
		System.out.println(parent.id);
		// 다운캐스팅 
		System.out.println(((Student)parent).grade); // 강제형변환하면 사용 가능 
		System.out.println(((Student)parent).department); 
//		System.out.println(parent.grade); // grade cannot be resolved or is not a field
//		System.out.println(parent.department); // department cannot be resolved or is not a field
		// 부모부분만 사용됨 자식부분인 grade, department는 접근 불가능 
	}
}
