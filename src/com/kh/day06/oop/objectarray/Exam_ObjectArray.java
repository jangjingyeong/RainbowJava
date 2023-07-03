package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String [] args) 
	{
//		Circle c = new Circle(); // 객체의 주소가 들어간다 
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		Circle [] cArray; // 배열 선언
		cArray = new Circle[5]; // 공간 할당 
		Circle c = cArray[0]; 
		System.out.println(c); // 공간 자체라서 null
		// c.radius = 10; // NullPointerException
		cArray[0] = new Circle(); // 공간에 객체를 넣음 
		System.out.println(cArray[0]); // com.kh.day06.oop.objectarray.Circle@626b2d4a 고유값
		// 주소값으로 봐도 상관없음 
		cArray[0].radius = 10;
		
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle();  // 이때 화살표가 생기는 것임.
		} 
		// new Circle을 해주었기 때문에 아래처럼 .radius에 접근 가능하게 된 것임 
		// 위의 포문을 주석처리하면 NullPointerException 오류가 뜸 
		cArray[0].radius = 1; 
		cArray[1].radius = 2; 
		cArray[2].radius = 3; 
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
		
		
		
		
		
		
	}
}
