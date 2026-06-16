package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력받은 값이 1 이상인 경우 확인
		if (num >= 1) {
		
			// - 초기식 : int i = num; // 입력받은 숫자부터 시작!
			// - 증감식 : i--;	      // 1까지 하나씩 감소!
			// - 조건식 : i > 0;		  
			for(int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		
		} else {
			// 입력받은 값이 1 미만이라면 "1 이상의 숫자를 입력해주세요." 출력
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

		sc.close();
	}

}
