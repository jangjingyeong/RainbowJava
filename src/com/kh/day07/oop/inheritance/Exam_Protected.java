package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
}

class Child extends Parent {
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1; // public 
		super.def = 2; // default
		super.pro = 3; // protected
		// super.pri = 4; // private -> The field Parent.pri is not visible
	}
}

class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
		// super.def = 2; // defalut -> 다른 클래스여서 접근 불가능 The field Point.def is not visible
		super.pro = 3; // protected -> Point와 ShapePoint 상속관계여서 접근 가능하게 해줌 
		// super.pri = 4; // private이기 때문에 당연히 안 됨! 
	}
}



public class Exam_Protected {
	public static void main(String [] args) {
		
	}
}
