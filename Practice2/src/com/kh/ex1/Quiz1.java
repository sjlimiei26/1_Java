package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	/*
	 * 	[입력 예시]
		이름: 이순신
		나이: 25
		키: 176.5
		
		[출력 예시]
		====================
		이름: 이순신
		나이: 25세
		키: 176.5cm
		====================
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		// 이름 입력받기 --> String(문자열)
		String name;
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		// 나이 --> int(정수)
		int age;
		age = sc.nextInt();
		
		System.out.print("키 : ");
		// 키 --> double(실수)
		double height;
		height = sc.nextDouble();
		
		System.out.println("====================");
		System.out.println("이름: " + name);
		// System.out.println("나이: " + age +"세");
		System.out.printf("나이: %d세\n", age);
		System.out.println("키: " + height + "cm");
		System.out.println("====================");
		
		sc.close();
	}

}
