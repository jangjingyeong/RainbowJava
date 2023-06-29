package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		// 2차원 배열 선언 먼저 
		int [][] nums = new int[5][5];
		// 배열에 숫자 넣기
		int k = 1;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 4; j >= 0; j--) {
				nums[i][j] = k;
				k++;
			}
		}
		// 출력하기 
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.printf("%2d ", nums[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void exercise2() {
		// 2차원 배열 선언 먼저 
		int [][] nums = new int[5][5];
		// 배열에 숫자 넣기
		int k = 1;
//		nums[4][0] = 1;
//		nums[3][0] = 2;
//		nums[2][0] = 3;
//		nums[1][0] = 4;
//		nums[0][0] = 5;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 4; j >= 0; j--) {
				nums[j][i] = k;
				k++;
			}
		}
		
		// 출력하기 
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.printf("%2d ", nums[i][j]);
			}
			System.out.println();
		}
		}
	
	public void exercise3() {
		// 2차원 배열 선언 먼저 
		int [][] nums = new int[5][5];
		// 배열에 숫자 넣기
		int k = 1;
//		nums[0][0] = 1;
//		nums[1][0] = 2; 
//		nums[2][0] = 3; 
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[j][i] = k;
				k++;
			}
		}
		// 출력하기 
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.printf("%2d ", nums[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise4() {
		// 2차원 배열 선언 먼저 
		int [][] nums = new int[5][5];
		// 배열에 숫자 넣기
		int k = 1;
//		nums[0][0] = 1;
//		nums[0][1] = 2;
//		nums[0][2] = 3;
//		nums[0][3] = 4;
//		nums[0][4] = 5;
//		
//		nums[1][4] = 6;
//		nums[1][3] = 7;
//		nums[1][2] = 8;
//		nums[1][1] = 9;
//		nums[1][0] = 10;
		// 힌트! 짝수일 때는 증가, 홀수일 때는 감소~! 
		
		for(int i = 0; i < nums.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < nums[i].length; j++) {
					nums[i][j] = k;
					k++;
				} 
			} else {
				for(int j = 4; j >= 0; j--) {
					nums[i][j] = k;
					k++;
				}
			}		
		}
		// 출력하기 
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.printf("%2d ", nums[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3 3.4) (3.5 3.6) (3.7 4.0) (4.1 4.2)
		// 2차원 배열 선언 
//		double [][] score = new double[4][2];
		// 성적 저장 
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
		// 2차원 배열 선언+초기화 한번에
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		// 평균 구하기
		double sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
//				System.out.printf("%.1f ",sum);  // sum에 더해지는 것 확인 
			}
//			System.out.println();
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.3f\n ", result);
		
		// 성적 전체 출력 
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
	}
	
	
}
