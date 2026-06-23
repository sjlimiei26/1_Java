package com.kh.menu;

// 자식 타입 클래스 : Drink 클래스로부터 상속 받음
public class Latte extends Drink {

	public Latte(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void order() {
		System.out.println("에스프레소 샷을 추출하고 우유를 채웁니다");
	}

	
}
