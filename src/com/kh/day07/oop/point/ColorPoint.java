package com.kh.day07.oop.point;


public class ColorPoint extends Point { // extends를 써서 확장 
	private String color;
	
	public ColorPoint() {
//		super();
	}
	
	public ColorPoint(int x, int y, String color) {
//		super.x = x;
//		super.y = y;
		super(x, y); // x, y를 넘겨 받아서 초기화 해야함 근데 private라 접근X 
		// 부모의 생성자 호출, private에 접근하지 않고 값을 넣게 됨 
		this.color = color;
		
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		// super. 하면 허용된 선에서 부모가 가진 걸 다 쓸 수 있음 
		super.showPoint(); // super키워드를 보면 부모에 있는 것 가져왔음을 알 수 있음 
	}
}

//public class ColorPoint {
//
//}
