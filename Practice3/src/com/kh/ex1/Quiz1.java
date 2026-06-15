package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형 한 변의 길이 : ");
		int num = sc.nextInt();

		// 둘레 = 한 변의 길이 x 4
		System.out.println("둘레의 길이 : " + (num * 4));
		
		// 넓이 = 한 변의 길이 x 한 변의 길이
		System.out.println("넓이 : " + (num * num));
		
		sc.close();
	}

}





