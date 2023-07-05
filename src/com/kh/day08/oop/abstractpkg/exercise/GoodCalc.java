package com.kh.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class GoodCalc extends Caculator {
	//- The type GoodCalc must implement the inherited abstract method Caculator.add(int, int)
	// override 해줘야 함 

	@Override
	public int add(int a, int b) {
		// a와 b를 합하여 리턴
		int result = a + b;
		return result;
		// 더 짧게 쓰면 return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// a와 b를 빼서 리턴
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// 배열을 입력받아 평균을 구해서 리턴
		// 평균 = 전체합 / 갯수
		// 전체합은 배열에서 하나씩 꺼내서 합해줘야 하므로 누적합 해야함
		// 누적합 => sum += num;
		int sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum += a[i];			
		double avg = sum / (double)a.length;
		return avg;
	}
	
}
