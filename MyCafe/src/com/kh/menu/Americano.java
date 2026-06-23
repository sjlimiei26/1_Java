package com.kh.menu;

// 자식 타입 클래스 : Drink 클래스로부터 상속 받음
public class Americano extends Drink {
	/*
		public Americano() {
			super();   // --> Drink();
		}
	 */
	public Americano(String name, int price) {
		// super();
		super(name, price);
	}

	@Override
	public void order() {
		System.out.println("에스프레소 샷을 추출하고 얼음을 채웁니다");
	}
	
	
}
