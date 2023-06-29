package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exeption {
	
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		while(true) {
			// 1. num1 cannot be resolved to a variable 
//			int num1, num2; // 먼저 선언해야 함 
			// 2. The local varialbe num1 may not have been initialized
//			num1 = 0; // 초기화하고 써야 함 
//			num2 = 0;
			// 오류나는	부분만 try에 넣으면 됨 
			// 멀티캐치절 
			try
			{
				System.out.print("정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = sc.nextInt();			
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.", num1, num2, result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			} catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨어요. 정수를 입력해주세요.");
				sc.next();
			}
		}		
	}
	
	public void exercise2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를
		// 처리하여 다시 입력받도록 하여라.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
//			int num = sc.nextInt();
			try {
				sum += sc.nextInt();				
			} catch(InputMismatchException e) {
				System.out.println("문자를 입력하셨어요. 정수를 입력해주세요.");
				sc.next(); // 입력한 문자를 제거함 - 무한반복 되지 않게 해줌  
				i--; // i값을 줄여서 i++를 만나서 증가하도록 하기 위함.
				continue;  // i++로 가게 해줌 
				// sc.next(); i--; continue; 세트로 외우기! 
			}
		}
		System.out.printf("합은 %d", sum);
		
		
//		for(;;) {
//			try
//			{
//				Scanner sc = new Scanner(System.in);
//				System.out.print("0>> ");
//				int num1 = sc.nextInt();
//				System.out.print("1>> ");
//				int num2 = sc.nextInt();
//				System.out.print("3>> ");
//				int num3 = sc.nextInt();
//				int result = num1 + num2 + num3; 
//				System.out.printf("%d 더하기 %d 더하기 %d는 %d입니다.", num1, num2, num3, result);			
//			} catch(InputMismatchException e) {
//				System.out.println("문자를 입력하셨어요. 정수를 입력해주세요.");
//			}
//		}
	}
	
	public void exercise3() {
		// 범위를 벗어난 배열의 접근 
		// (ArrayIndexOutOfBoundsException)
		int [] intArrs = new int[5];
		// try 자동완성 : try옆에 커서를 두고 Ctrl + space bar 
		try {
			System.out.println(intArrs[5]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
	
	
	public void exercise4() {
		// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
		// (NumberFormatException) 
		String [] str = new String[2];
		str[0] = "1026";
		str[1] = "5.15";
		// String -> int 
		// Exception in thread "main" java.lang.NumberFormatException: For input string: "5.15"
		try {
			int result = Integer.parseInt(str[0]);
			System.out.printf("숫자로 변환된 값은 %d\n", result);
			int check = Integer.parseInt(str[1]);
			System.out.printf("숫자로 변환된 값은 %d\n", check);			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다");	
		}
	}
	
	
}
