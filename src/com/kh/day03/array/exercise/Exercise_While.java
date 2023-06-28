package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void whileExercise1() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
				// 입력한 수의 합을 출력하시오.
				// 정수 하나 입력 : 3
				// 정수 하나 입력 : 4 
				// 정수 하나 입력 : 7
				// 정수 하나 입력 : -1 
				// 입력하신 수의 합은 14입니다.
				int input = 0;
				int sum = 0;
				Scanner sc = new Scanner(System.in);
				// for(;;){} 혹은 while(true){} 이렇게 하면 무한반복
				// 첫번째 방법
//				while(true) { 
//		 			System.out.print("정수 하나 입력 : ");
//					input = sc.nextInt();
//					if(input != -1) {
//						sum += input;
//					}else {
//						break;
//					}
//				}
//				System.out.println("입력하신 수의 합은 " + sum + "입니다.");
				
				// 두번째 방법
//				while(input != -1) {
//					System.out.print("정수 하나 입력 : ");
//					input = sc.nextInt();
//					sum += input;
//				}
//				System.out.println("입력하신 수의 합은 " + (sum+1) + "입니다.");
				
				// 세번째 방법
				System.out.print("정수 하나 입력 : ");
				input = sc.nextInt();
				while(input != -1) {
					sum += input;
					System.out.print("정수 하나 입력 : ");
					input = sc.nextInt();
				}
				System.out.println("입력하신 수의 합은 " + sum + "입니다.");
		
	}
	
	public void whileExercise2() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
				int i = 1;
				int sum = 0;
				while(i <= 100) {
					if(i % 2 != 0) {
						sum += i;
					}
					i++;
				}
				
//				int i = 0;
//				int sum = 0;
//				while(i < 100) {
//					i += 2;
//					sum += i;
//				}
				
				System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
	
	
}
