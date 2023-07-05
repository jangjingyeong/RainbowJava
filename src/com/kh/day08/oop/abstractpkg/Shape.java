package com.kh.day08.oop.abstractpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// 상속받은 추상메소드를 오버라이딩 해야함, 안할거면 class 앞에 abstract 붙여야함 
	@Override
	public void draw() {
		
	}

}

public abstract class Shape {  
	// 아래 2. 오류를 없애기 위해, 추상클래스로 만들어주기 위해 abstract 추가 
	
	
	// 필드 생략

	// 기본 생성자
	public Shape() {} 
	
	
	//메소드
	public void paint() {}
	abstract public void draw();
	// abstract public void draw() {}
	// 1. Abstract methods do not specify a body
	// {} 몸체 없애야함 
	// abstract public void draw();
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	// 3. The type Shape must be an abstract class to define abstract methods
	// 추상메소드를 쓰려면 추상클래스여야 함 -> 클래스에 abstract 붙이기 
}
