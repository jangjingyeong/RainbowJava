package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface {
	//public class SamsungPhone implements PhoneInterface
	// 위처럼 쓰면 
	// The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
	// SamsungPhone에 빨간 줄, 인터페이스 어쩌구.. 오버라이딩 해줘야함 
	// a superclass must be a class => extends 안됨! 
	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루루루");
		
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
		
	}
}
