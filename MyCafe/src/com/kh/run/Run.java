package com.kh.run;

import com.kh.menu.Americano;
import com.kh.menu.Drink;
import com.kh.menu.Latte;

public class Run {

	public static void main(String[] args) {

		// Drink 타입의 크기가 2인 배열 생성
		Drink[] menu = new Drink[2];
		
		// 1. 아메리카노 (2000원)
		menu[0] = new Americano("아메리카노", 2000);
		// Drink 타입 (참조변수)
		// Americano  타입 (생성 객체) -> 다형성이 적용되어 가능!!
		
		// 2. 라떼 (3000원)
		menu[1] = new Latte("라떼", 3000);
		
		// 반복문 사용하여 음료 정보 출력
		System.out.println("======= My Cafe =====================");
		for(int i=0; i < menu.length; i++) {
			
			String name = menu[i].getName();
			int price = menu[i].getPrice();
			
			System.out.printf("[%s] 가격: %d원\n", name, price);
			menu[i].order();
			
		}
	}

}
