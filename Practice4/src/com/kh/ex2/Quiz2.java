package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		// 양수인지 먼저 확인 => num > 0
		if (num > 0) {
			// 짝수인지 홀수인지 확인
			// 짝수 판별식 => num % 2 == 0 
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
			
		} else {
			// 입력된 값이 양수가 아닌 경우
			System.out.println("양수만 입력해주세요.");
		}

	}

}




