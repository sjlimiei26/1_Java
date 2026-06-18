package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {
	/*
		1번 학생 점수 입력 : 80
		2번 학생 점수 입력 : 95
		3번 학생 점수 입력 : 90
		4번 학생 점수 입력 : 75
		5번 학생 점수 입력 : 85
		
		총합 : 425점
		평균 : 85.0점
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// * 5명의 학생 점수를 저장할 배열 선언 및 생성
		int[] sArr = new int[5];
		
		/*
		System.out.print("1번 학생 점수 입력 : ");
		sArr[0] = sc.nextInt();
		
		System.out.print("2번 학생 점수 입력 : ");
		sArr[1] = sc.nextInt();
		
		System.out.print("3번 학생 점수 입력 : ");
		sArr[2] = sc.nextInt();	

		System.out.print("4번 학생 점수 입력 : ");
		sArr[3] = sc.nextInt();		
		
		System.out.print("5번 학생 점수 입력 : ");
		sArr[4] = sc.nextInt();	
		*/	
		for(int i=0; i<sArr.length; i++) {
			
			System.out.print((i+1) + "번 학생 점수 입력 : ");
			sArr[i] = sc.nextInt();				
			
		}
		
		// 총합과 평균 계산
		// * 학생들의 점수 -> 배열에 저장되어 있음
		int total = 0;
//		total = total + sArr[0]; // 0 + 1번_학생점수
//		total = total + sArr[1]; // (0 + 1번_학생점수) + 2번_학생점수
//		total = total + sArr[2]; // (0 + 1번_학생점수 + 2번_학생점수) + 3번_학생점수
//		total = total + sArr[3];
//		total = total + sArr[4];
		
		for(int i=0; i < sArr.length; i++) {
			// total = total + sArr[i];
			total += sArr[i];
		}
		
		// * 평균
		// double avg = total / sArr.length;
		double avg = (double)total / sArr.length;
		
		// 결과 출력
		System.out.println("총합 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
	}

}





