package com.kh;

import java.util.Scanner;

public class B_Switch {
	/*
	 * * 조건문 switch
	 * : 동등 비교를 통해 흐름을 제어
	 * 
	 * [표현법]
	 * 			switch (비교대상) {
	 * 				case 값1:
	 * 					// 비교대상 == 값1 일 때 실행할 내용
	 * 					break;
	 * 				case 값2:
	 * 					// 비교대상 == 값2 일 때 실행할 내용
	 * 					break;
	 * 				...
	 * 				default:
	 *					// 모든 case에 해당하지 않을 때 실행할 내용
	 *					break;
	 * 			}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1();
		method2();
	}

	public static void method1() {
		/* 정수를 입력 받아 아래 조건에 맞게 출력
		 * 
		 * 1: 빨간색
		 * 2: 노란색
		 * 3: 초록색
		 * 그 외: 검은색
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		// 비교 대상 : 입력받은 값 -> num
		switch (num) {
		case 1:	// num == 1
			System.out.println("빨간색");
			break;
		case 2: // num == 2
			System.out.println("노란색");
			break;
		case 3: // num == 3
			System.out.println("초록색");
			break;
		default:
			System.out.println("검은색");
			break;
		}
		
	}
	
	public static void method2() {
		// 02_Operator 프로젝트 D_Ternary 클래스의
		//    method2() 내용을 switch 를 사용해보자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음과 같이 입력 시 연산 결과를 확인할 수 있습니다.");
		System.out.println("예) 10 20 + => 10+20=30 의 결과 확인");
		System.out.print(" : ");
		// 버퍼 : 
		int n1 = sc.nextInt();		// 버퍼 : 10 20 +\n , n1 = 10
		// 버퍼 : 20 +\n
		int n2 = sc.nextInt();     // 버퍼 : 20 +\n, n2 = 20
		// 버퍼 : +\n
		String strOp = sc.next();  // 버퍼 : +\n, strOp = +
		// 버퍼 : 
		char op = strOp.charAt(0); // "+" -> '+'
		
		// ---- switch 를 사용하여 처리 ----
		// => 비교대상 : 사용자가 입력한 기호 : op
		//    비교할 값 : '+', '-' 
		switch (op) {
		case '+':
			System.out.println("n1 + n2 = " + (n1 + n2));
			break;
		case '-':
			System.out.println("n1 - n2 = " + (n1 - n2));
			break;
		// TODO: '*', '/', '%' 추가해보자! -> 수업 종료(18시) 전까지 이메일로 제출
		case '*':
			System.out.println("n1 * n2 = " + (n1 * n2));
			break;
		case '/':
			System.out.println("n1 / n2 = " + (n1 / n2));
			break;
		case '%':
			System.out.println("n1 % n2 = " + (n1 % n2));
			break;				
		default:
			System.out.println("입력이 잘못되었습니다.");
			break;
		}
	}
}




