package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	 
	// 1. Illegal modifier for the interface field PhoneInterface.name; 
	// only public, static & final are permitted -> 부적절한 지시자
	// private String name;
	// 2. The blank final field name may not have been initialized 상수 초기화 필요
	// public String name;
	public String name = "";
	public static final int TIME_OUT = 10000;
	
	// 3. Abstract methods do not specify a body
	// public abstract void receiveCall() {} 
	public abstract void receiveCall();
	void sendCall(); 
	abstract void printLogo();
	// 인터페이스가 규격으로 사용되거나 클래스와 클래스를 연결해주는 용도로 사용하게 될 것
	
	public default void showLogo() {
		// 디폴트 메소드 
		// 하위 호환성을 위해 작성함. 
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
