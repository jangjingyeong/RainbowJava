package com.kh.day08.oop.interfacepkg.zoo;

public interface FoodInterface {
	//public abstract String animalFood();
	// public abstract는 생략 가능
	String animalFood();
	String makeSound(); // 이걸 추가하면 동물클래스들에 오버라이딩이 되어야함 
}
