package com.kh.day08.oop.homework.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// cvc
	// 비밀번호 
	int cardNumber;
	static int serialNum = 10000; 
	// 대입되어 출력이 되는데 아래에서 증가되는 값을 저장하지 못함
	// 매번 new Card 할 때 10000으로 초기화 됨 
	// 계속 저장이 되고 유지가 되어야 함 그래서 전역변수로 만들어야 한다 -> static
	// static이 없을 땐 10000만 세개 나옴, static 넣으니 10000, 10001, 10002로 나옴 
	
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	public void printCardInfo() {
		System.out.println(this.cardNumber + "입니다.");
	}
}
