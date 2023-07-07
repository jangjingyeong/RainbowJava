package com.kh.day10.collection.list;

public class IntList {
	// 필드
	int [] nums;
	int size;
	
	// 생성자 
	public IntList() {
		nums = new int[3]; // 배열의 할당
		size = 0; // 변수의 초기화 
	}
	// ㅇㅅㅇ 

	public void add(int num) {
		// 인덱스 신경쓰지 않고 넣으려면 넣을 것 num 넣어야할 곳 nums 
		nums[size] = num;
		size++;
	}

	public int get(int index) {
		return nums[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
