package com.kh.day08.oop.homework.q5;

public class Person {
	// 이름
	String name;
	// 돈
	int money;
	// 커피 사먹음 
	
	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void buyCoffee(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나와야 함. 
//		this.money = this.money - money;
		this.money -= money;
		
		cafe.makeCoffee(money);
	}
	// 가지고 있는 정보 출력해주는 메소드가 필요 
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
