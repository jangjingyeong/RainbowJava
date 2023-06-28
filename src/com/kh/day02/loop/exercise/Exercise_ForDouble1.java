package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		for(int k = 1; k < 10; k++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + k + " = " + j*k + "\t");
			}
			System.out.println();
		}
		// 안에 있는 게 단, 밖에 있는 게 곱해지는 1~9 
		// \t는 tab이라서 일정 간격 띄워줌 
		
		
		
		
//		// 구구단 출력 
//		for(int h = 2; h < 10; h++) {
//			System.out.println(h + "단");
//			for(int k = 1; k < 10; k++)
//			System.out.println(h + " * " + k + " = " + h*k);
//		}
//		System.out.println("3단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("3 * " + h + " = " + 3*h);
//		}
//		System.out.println("4단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("4 * " + h + " = " + 4*h);
//		}
//		System.out.println("5단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("5 * " + h + " = " + 5*h);
//		}
		
		
		
	}
}
