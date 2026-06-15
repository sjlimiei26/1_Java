package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();

		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// (조건식) ? (조건식의 결과가 true일 때 사용할 값) : (조건식의 결과가 false일 때 사용할 값);
		String result = age < 12 || height < 130.0 ? "보호자 동반 필수" : "단독 탑승 가능";
		String result2 = age >= 12 && height >= 130.0 ? "단독 탑승 가능" : "보호자 동반 필수";
		System.out.println(result);
		
		sc.close();
	}

}
