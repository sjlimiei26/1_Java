package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0-100): ");
		int score = sc.nextInt();
		
		// 입력받은 값 (score)이 0보다 크거나 같고, 100보다 작거나 같은가?
		// => score >= 0 && score <= 100
		if (score >= 0 && score <= 100) {
			// 점수 범위에 해당될 때
			
			// 90점 이상일 때는 "A"
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70){
				System.out.println("C");
			} else {
				System.out.println("F");
			}
			
		} else {
			// score 값이 0보다 작거나, 100보다 클 때..
			System.out.println("점수를 올바르게 입력해주세요.");
		}

	}

}





