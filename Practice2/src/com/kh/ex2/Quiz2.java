package com.kh.ex2;

public class Quiz2 {
	/*
		[출력 예시]
		교환 전: a = 10, b = 20
		교환 후: a = 20, b = 10
	 */
	public static void main(String[] args) {
		// 정수형 변수 a, b에 각각 10, 20 저장
		int a = 10;
		int b = 20;
		System.out.printf("교환 전: a = %d, b = %d\n", a, b);

		// a의 값과 b의 값을 교환
		int x = a;
		
		a = b;
		b = x;
		System.out.printf("교환 후: a = %d, b = %d\n", a, b);
		
	}

}
