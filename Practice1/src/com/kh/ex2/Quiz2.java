package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// "이름을 입력하세요: " 출력 -> System.out.printXXX
		System.out.print("이름을 입력하세요: ");
		
		// 이름 입력받기	-> Scanner
		//  -> 문자열 입력 : nextLine() , next()
		String name = sc.nextLine();
		
		// "나이를 입력하세요: " 출력 -> System.out.printXXX
		System.out.print("나이를 입력하세요: ");
		
		// 나이 입력받기	-> Scanner
		// String age =  sc.nextLine();		// 나이를 문자형식으로 저장
		// TODO: 숫자 형식으로 저장 -> nextInt()
		int age = sc.nextInt();
		
		
		
		// "{이름}님({나이}세)의 자바 학습을 환영합니다!" 출력	-> System.out.printXXX
		// -> %s님(%s세)의 자바 학습을 환영합니다!
		// System.out.printf("%s님(%s세)의 자바 학습을 환영합니다!", name, age);
		// TODO: 숫자 형식으로 저장된 나이
		System.out.printf("%s님(%d세)의 자바 학습을 환영합니다!", name, age);
		
		sc.close();
	}

}







