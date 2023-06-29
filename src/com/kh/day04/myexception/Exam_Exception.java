package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args)
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int input2 = sc.nextInt();
			System.out.println("나눠드릴게요^^. 조금만 기다리세요~");
			int result = input1 / input2;
			System.out.printf("몫은 %d입니다~", result);			
		} catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			// ㄴ오류메세지도 같이 출력하도록 의도한 것! 
			//java.lang.ArithmeticException: / by zero
			//at com.kh.day04.myexception.Exam_Exception.main(Exam_Exception.java:16)
			System.out.println("이런이런 0으로 나누려고 하시네요?");
		}
	}
}
