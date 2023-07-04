package com.kh.day07.oop.member;

public class Member {
	// 입력 받을 거 3개 정도 만들고 
	// 캡슐화의 원칙 적용해서 구성 
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	public Member() { // 기본생성자
		// 클래스 이름과 같은 메소드는 생성자이고 생성자는 객체 초기화의 역할을 함 
		
	}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		// 이름이 같고 매개변수의 타입이나 갯수가 다름 -> 오버로딩 
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	// getter 메소드 - 필드에 있는 걸 사용할 수 있도록 해줌, void + return이 안 됨 
	public String getMemberId() {  // public 자료형 get멤버변수() {} 
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	// new Member().setMemberId("khuser01"); 이렇게 호출을 했어 
	// 이걸 내가 매개변수를 통해서 받아서 쓰는 거임 
	// setter 메소드 - 값을 넘겨받아서 필드에 있는 멤버 변수에 넣어줌 
	public void setMemberId(String memberId) { // return 쓰지 않으니 void 쓰면 됨 
		// 소괄호 안의 매개변수의 역할 : 값을 받아서 메소드 안에서 쓸 수 있게 해줌
		// memberId = "khuser01"; 
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
}
