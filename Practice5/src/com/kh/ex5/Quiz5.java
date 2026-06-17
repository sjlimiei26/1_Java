package com.kh.ex5;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		/*
		 * 숫자 입력 : 4
		 * 
		 * 출력)
		 * ****
		 * ***
		 * **
		 * *
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num;i > 0;i--) { 
			// 입력받은 값만큼 행 출력. 
			// 단, 이번에는 첫번째 행의 * 개수가 입력받은 값 만큼 출력되어야 함! 
	
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
