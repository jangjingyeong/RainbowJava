package com.kh.day07.oop.polymorphism.overriding;

public class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
//		super.draw();
	}  // draw 적고 ctrl + space bar 하면 자동완성 
	// 원래는 부모의 draw를 불러오는데 이걸 재정의할 수 있음 
}
