package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int n2 = sc.nextInt();
		
		// 입력받은 두 정수가 1 이상인지 확인
		// 1) n1 이 1 이상인가? n1 >= 1
		// 2) n2 가 1 이상인가? n2 >= 1
		if (n1 >= 1 && n2 >= 1) { 
			// ...
			// n1 값과 n2 값의 대소 비교
			int max = (n1 > n2) ? n1 : n2; // 큰 값 15
			int min = (n1 < n2) ? n1 : n2; // 작은 값 4
			
			// - 초기식 : int i = min;
			// - 증감식 : i++;
			// - 조건식 : i <= max;
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
			
			
		} else {
			// n1이 1 미만이거나 n2가 1 미만일 경우
			System.out.println("1 이상의 숫자를 입력해주세요");
		}

	}

}
