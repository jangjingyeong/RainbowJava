package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args)
	{
		
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		// -> 한줄로, 매개변수 있는 생성자 사용 
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStoty = new Book("춘향뎐");
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStoty.title + ", " + loveStoty.author);
		
		
		Rectangle rect = new Rectangle();  // 객체 생성 
		Scanner sc = new Scanner(System.in);  // 입력 받기 
		System.out.print("너비를 입력해주세요 ");   // 가이드 메세지 
		rect.width = sc.nextInt();
		System.out.print("높이를 입력해주세요 ");   // 가이드 메세지 
		rect.height = sc.nextInt();
		int result = rect.getArea();
		System.out.println("해당 사각형의 넓이는 " + result + "입니다.");
		
	
		
		new Circle(); // 이렇게 두면 사라짐
		// 참조변수 circle, circle2, ... 를 통해서 사용하게 됨 
		Circle circle = new Circle(); // 메모리 상에 올라감 
		Circle circle2 = new Circle(); 
		Circle circle3 = new Circle();
		Circle circle4 = new Circle(); // 다 다른 써클, 4개 메모리 할당 
		circle.radius = 100;
		circle2.radius = 1000;
		circle3.radius = 10000;
		
		System.out.println(circle.getArea());
		System.out.println(circle2.getArea());
		System.out.println(circle3.getArea());
		
		// 여기서 해도 되고 저기서 해도 되고~ 
		// 하지만 우리는 구분해서 실행은 Run 클래스에서 할 것 
		Circle pizza;

//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		// 위 세줄을 한줄로 할 수 있음 
		pizza = new Circle(10, "청년피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
		// 위 세줄을 한줄로 줄이기 
		Circle donut = new Circle(2, "청년도넛");
		
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f", donut.name, area);
		
	}
}
