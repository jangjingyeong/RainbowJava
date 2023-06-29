package com.kh.day04.dimarray;

public class Exam_DimArray {
	public static void main(String [] args)
	{
		int num = 0;
		int [] nums = new int[10]; // 배열의 선언, 생성, 할당
		// nums는 참조변수 
		int [][] dimNums = new int[2][5];  // 2차원 배열
		// dimNums는 참조변수 int[2]라는 저장 공간을 받음 
		// 그 하나에 대해서 공간 5개가 할당됨 
		// 2개가 각각 5개의 공간을 할당 받기 때문에 10개의 데이터 저장 가능
		System.out.println("앞의 크기 : " + dimNums.length);
		System.out.println("뒤의 크기 : " + dimNums[0].length);
		System.out.println("뒤의 크기 : " + dimNums[1].length);
		
//		int [][] arrs = new int[4][4];
//		arrs[0][0] = 1; 
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		
//		arrs[1][0] = 5; 
//		arrs[1][1] = 6;
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		
//		arrs[2][0] = 9; 
//		arrs[2][1] = 10;
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		
//		arrs[3][0] = 13; 
//		arrs[3][1] = 14;
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
		
		// 입력 반복문으로 줄여보기 
		int [][] arrs = new int[4][4];
		int k = 1; 
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		
//		System.out.print(arrs[0][0] + " ");
//		System.out.print(arrs[0][1] + " ");
//		System.out.print(arrs[0][2] + " ");
//		System.out.print(arrs[0][3] + " ");
//		System.out.println();
//		System.out.print(arrs[1][0] + " ");
//		System.out.print(arrs[1][1] + " ");
//		System.out.print(arrs[1][2] + " ");
//		System.out.print(arrs[1][3] + " ");
//		System.out.println();
		
		// 출력 반복문으로 줄여보기 
		for(int j = 0; j < arrs.length; j++) {
			for(int i = 0; i < arrs[j].length; i++) {
				System.out.print(arrs[j][i] + " ");
			}
			System.out.println();
		}
		
	}
}
