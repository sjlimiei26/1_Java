package com.kh.ex1;

public class Quiz1 {

	public static void main(String[] args) {
		// 주석 : 프로그램 실행 상관 없는 부분. 설명.
		// 한줄 주석
		/*
		 * 여러 줄 주석
		 * 아무거나
		 * 주석
		 * 안녕
		 *  */
		
		/*
			====================
			이름 : 홍길동
			나이 : 20세
			이메일: hong@gmail.com
			====================
		 */
		System.out.println("====================");
		// System.out.println("이름 : 임수진");
		// * 본인 이름을 지시어로 형식 지정하여 출력 --> 문자열 %s
		System.out.printf("이름 : %s\n", "임수진");
		// System.out.println("나이 : 20세");
		// * 본인 나이를 지시어로 형식 지정하여 출력 --> 정수 %d
		System.out.printf("나이 : %d세\n", 20);
		System.out.println("이메일: hong@gmail.com");
		System.out.println("====================");
	}
}
