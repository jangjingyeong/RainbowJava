package com.kh.day03.array;

public class Exam_ArraySort {
	public static void main(String [] args)
	{
		// {1, 3, 6, 10, 4, 7, 5, 2, 9, 8} 이럴 때 정렬 하고 싶음
		// 어떻게 다음 값을 찾느냐 
		// 정렬 알고리즘의 종류 
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 4. 퀵정렬
		// 5. .... 
		int num1 = 5;
		int num2 = 15;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		int temp = num1; // temp : 5, num1의 값을 임시저장해줄 변수 
		num1 = num2; // num1 : 15, num1의 5라는 값이 지워짐 
		num2 = temp; // num2 : 15  
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		// 두 개의 자리를 바꿀 때에는 임시변수가 꼭 필요함! 
		
		int [] nums = {2, 1, 3};
		// 3, 2, 1이 되도록 바꿔보기 
		int temp1 = nums[0];  // 2 저장 
		nums[0] = nums[2]; // 맨앞에 3 넣음 
		nums[2] = nums[1]; // 끝에 1 넣음 
		nums[1] = temp1; // 가운데 2 넣음 
		
		for(int i =0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
}
