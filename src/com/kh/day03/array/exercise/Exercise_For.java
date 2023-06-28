package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	public void ForExercise1() {
		
			// 1부터 10까지의 덧셈을 표시하고 합도 구하시오. 
			// 1+2+3+4+5+6+7+8+9+10=55
			int sum = 0;
//			for(int i = 1; i <= 10; i++) {
//				sum += i;		
//				if(i <= 9) {
//					System.out.print(i + "+");				
//				} else {
//					System.out.print(i + "=");		
//				} 
//			} System.out.print(sum);
			
			// while문으로 하기
			int i = 0;
			while(i < 10) {
				i++;
				sum += i;
				if(i <= 9) {
					System.out.print(i + "+");				
				} else {
					System.out.print(i + "=");		
				} 
			} System.out.print(sum);
		
	}
	
	public void ForExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
				// 그 수의 구구단을 출력하세요.
				// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
				Scanner sc = new Scanner(System.in);
				System.out.print("1 ~ 9 사이의 양수를 입력해주세요 : ");
				int dan = sc.nextInt();
				if(dan >= 1 && dan <= 9) {
					System.out.println(dan + "단");
					for(int i = 1; i < 10; i++) {
						System.out.println(dan + " * " + i + " = " + dan*i);
					}
				} else {
					System.out.print("1 ~ 9 사이의 양수를 입력하셔야 합니다.");
				}
		
		
	}
	
	public void ForDouble_Exercise1() {
		
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
				for(int k = 1; k < 10; k++) {
					for(int j = 2; j < 10; j++) {
						System.out.print(j + " * " + k + " = " + j*k + "\t");
					}
					System.out.println();
				}
				// 안에 있는 게 단, 밖에 있는 게 곱해지는 1~9 
				// \t는 tab이라서 일정 간격 띄워줌 
	}
	public void ForDouble_Exercise2() {
		// 0시 0분부터 23시 59분 출력 
//		for(int k = 0; k < 24; k++) {
//			for(int h = 0; h < 60; h++) {
//				System.out.println(k + "시 " + h + "분");
//			}
//		}
		
		// printf 
		for(int k = 0; k < 24; k++) {
			for(int h = 0; h < 60; h++) {
				System.out.printf("%2d시 %2d분\n", k, h);
			}
		}
	}
	
	public void ForDouble_Exercise3() {
		// 별찍기
				// *
				// **
				// ***
				// ****
				// *****
				// ******
				// *******
				// ********
				// *********
				// **********
//				int count = 1;
//				for(int j = 0; j < 10; j++) {
//					for(int i = 0; i < count; i++) {			
//						System.out.print("*");
//					}
//					count++;
//					System.out.println();
//				}
				
				
				for(int j = 0; j < 10; j++) {
					for(int i = 0; i < j+1; i++) {			
						System.out.print("*");
					}
					System.out.println();
				}
	}
	
	
	public static void main(String [] args)
	{
		
		
	}
}
 