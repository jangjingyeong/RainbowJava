package com.kh.day09.objectpkg;

class Rect {
	int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {   // 오버라이딩 해줘야 함 
		Rect r = (Rect)obj; // 다운캐스팅 
		if(width*height == r.width*r.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class Exam_RectEquals {
	public static void main(String[] args) {
		Rect rect1 = new Rect(2, 3);
		Rect rect2 = new Rect(2, 3);
//		if(rect1 == rect2) { //a is not equal to b
//		if(rect1.equals(rect2)) { // a is not equal to b -> 오버라이딩 해줘야 함 
		if(rect1.equals(rect2)) { // a is equal to b -> rect1. 하고 eqauls(Object obj) - boolean - Rect로 선택
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}
	}

}
