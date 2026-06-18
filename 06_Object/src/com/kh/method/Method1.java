package com.kh.method;

import java.util.Scanner;

public class Method1 {
	/*
	 * * 메소드 : 함수. 클래스 내에서 특정 기능을 묶어놓은 부분.
	 * 
	 * * 표현법 *
	 * 
	 * 		[접근제한자] [예약어] 반환형 메소드명([매개변수]) {
	 * 			// 실행할 내용
	 * 		}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hE();		// hE 메소드 호출!!
		hE();
//		System.out.println("Bye Everyone!");
//		System.out.println("Bye Everyone!");
//		System.out.println("Bye Everyone!");
		
		hi("임수진");
		hi("초코");
		
		int random1 = getRandom();
		System.out.println("랜덤값 : " + random1);
		
		int random2 = getRandom(1000);
		System.out.println("랜덤값 : " + random2);
		
	}
	
	/**
	 * 메소드 실행 시 "Hi Everyone!"을 콘솔창에 출력
	 * 
	 * * main 메소드에서 호출할 예정!
	 */
	public static void hE() {	// he 메소드 정의
		
		System.out.println("Bye Everyone!@@@");
		
	}
	
	/**
	 * 메소드 실행 시 이름(name)을 전달받아
	 * "안녕하세요 {name}님!"을 콘솔창에 출력
	 */
	public static void hi(String name) {
		
		System.out.println("안녕하세요 " + name + "님!");
		
	}
	
	/**
	 * 메소드 실행 시 1 ~ 100 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		// 메소드 실행 후 결과값을 돌려줄때(전달할때)
		//   return 결과값;
		return random;
		
	}
	
	/**
	 * 메소드 실행 시 1부터 전달받은값(end) 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom(int end) {
		int random = (int)(Math.random() * end + 1);
		// 메소드 실행 후 결과값을 돌려줄때(전달할때)
		//   return 결과값;
		return random;		
	}

	
}






