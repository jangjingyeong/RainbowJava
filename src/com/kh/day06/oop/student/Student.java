package com.kh.day06.oop.student;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 입력
	// 평균 출력
	private String name; // private로 바꾸면 StudentRun에서 사용하던 거 오류남!! 
	// 오류나지 않게 하려고 getter 메소드, setter 메소드 사용 
	private int firstScore; // public이면 같은 패키지가 아닌 곳에서도 사용 가능하게 됨 
	private int secondScore; // 멤버변수는 모두 private으로 감싸주기 
	
	
	
	public Student() {
		name = "";
		firstScore = 0;
		secondScore = 0;
	}
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	public double getAvg() {
		double avg = (this.firstScore+this.secondScore) / 2;
		return avg;
	}
	// getter 메소드
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}
