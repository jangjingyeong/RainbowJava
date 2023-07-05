package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
		
		Caculator calc = new GoodCalc(); // 업캐스팅 
		// Caculator calc = new Caculator();
		// Cannot instantiate the type Caculator
		// 추상클래스는 객체 생성 안됨 
		 int [] a = {1,2,3,4,5};
		 System.out.printf("합 : %d\n", calc.add(1,2));
		 System.out.printf("차 : %d\n", calc.substract(20,10));
		 System.out.printf("평균 : %.2f\n", calc.average(a));
	}
}
