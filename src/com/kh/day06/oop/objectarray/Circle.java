package com.kh.day06.oop.objectarray;

public class Circle {
	int radius; // public 안쓰면 default
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {   // void가 아닌 int나 double -> 반환형 : 리턴이 되는지 안 되는지 알려줘야 함 
		double area = 3.14*radius*radius;
		return area;
	}
}
