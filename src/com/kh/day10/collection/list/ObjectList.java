package com.kh.day10.collection.list;

public class ObjectList {
//	int [] nums;
	Object [] objects;
	int size; // 길이 신경쓰지 않게 변수로 씀
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	// 추가하는 거
	public void add(Object input) { // 다양한 값 넣기 위해 Object input
		objects[size] = input;
		size++;
	}
	// 가져오는 거
	public Object get(int index) {
		return objects[index];
	}
	public int size() {
		return size;
	}
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
