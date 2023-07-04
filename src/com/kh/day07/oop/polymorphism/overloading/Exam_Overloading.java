package com.kh.day07.oop.polymorphism.overloading;

class Weapon {
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
	// 생성자도 메소드. 
	// 메소드 이름은 셋 다 같지만 매개변수의 갯수와 타입이 다름 
	// -> 오버로딩 
}
public class Exam_Overloading {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
		// 어떤 리터럴이 들어가도 메소드는 바뀌지 않음 
		// 메소드는 같아도 타입이 다름(정수, 실수, 문자, 문자열, 불린)
		
		
	}
}
