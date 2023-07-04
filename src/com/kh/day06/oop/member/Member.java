package com.kh.day06.oop.member;

public class Member {
	// 입력 받을 거 3개 정도 만들고 
	// 캡슐화의 원칙 적용해서 구성 
	private String name;
	private int buyTotal;
	private int buyAmount;
	
	public Member() {
		name = "";
		buyTotal = 0;
		buyAmount = 0;
	}
	public Member(String name, int buyTotal, int buyAmount) {
		name = this.name;
		buyTotal = this.buyTotal;
		buyAmount = this.buyAmount;
	}
	// getter 메소드 
	public String getName() {
		return this.name;
	}
	public int getBuyTotal() {
		return this.buyTotal;
	}
	public int getBuyAmount() {
		return this.buyAmount;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBuyTotal(int buyTotal) {
		this.buyTotal = buyTotal;
	}
	public void setBuyAmount(int buyAmount) {
		this.buyAmount = buyAmount;
	}
	
	
}
