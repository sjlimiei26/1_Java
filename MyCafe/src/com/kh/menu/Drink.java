package com.kh.menu;

// 부모 타입 클래스
public class Drink {
	private String name;	// 메뉴명
	private int price;		// 가격
	
	public Drink(String name, int price) {
		//super();   // 부모타입(Object)의 기본생성자
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void order() {
		System.out.println("음료를 준비합니다");
	}
	
}
