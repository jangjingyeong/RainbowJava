package com.kh.day06.oop.exercise;

public class Student {
	String name;
	int kor, eng, math;
	
	public Student() {
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	} // 생성자는 객체 초기화! 
	
	public Student(String name) {
		this.name= name;
	}
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(String name, int kor, int eng, int math) {
		this.name= name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 합계 메소드
	public int getTotal() { // 여기에 void를 쓰면 return을 안 써도 됨 
		int total = this.kor + this.eng + this.math;
		return total;
	}
	// 평균 메소드
	public double getAvg() {
		double avg = this.getTotal() / 3;
		return avg;
	}
}
