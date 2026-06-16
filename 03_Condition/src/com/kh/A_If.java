package com.kh;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램은 순차적으로 실행 (위 -> 아래, 왼쪽 -> 오른쪽)
	 * 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리 가능
	 * 
	 * * 조건문 if
	 * 
	 * [1] 단독 if문
	 * 
	 * 			if (조건식) {
	 * 				// 조건식의 결과가 true일 때 실행할 내용
	 * 			}
	 * 
	 * [2] if ~ else 문
	 * 			if (조건식) {
	 * 				// 조건식의 결과가 true 일 때 실행할 내용
	 * 			} else {
	 * 				// 조건식의 결과가 false 일 때 실행할 내용
	 * 			}
	 * 
	 * [3] if ~ else if ~ else 문
	 * 			if (조건식1) {
	 * 				// 조건식1의 결과가 true 일때 실행
	 * 			} else if (조건식2) {
	 * 				// 조건식1의 결과가 false 이고, 조건식2의 결과가 true 일 때 실행
	 * 			} else {
	 * 				// 조건식1, 조건식2의 결과가 모두 false 일 때 실행
	 * 			}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1();
		method2();
	}
	
	public static void method1() {
		// 입력받은 값이 1 ~ 10 사이의 값이면 해당 값을 출력
		//			그렇지 않으면 "범위를 벗어났습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 10 사이의 값 입력 : ");
		int num = sc.nextInt();
		
		// 조건식 ? 1 ~ 10 사이의 값 => 값이 1보다 크거나 같고, 10보다 작거나 같아야 함.
		//			num >= 1 && num <= 10
		if(num >= 1 && num <= 10) {
			// num의 값이 1 ~ 10 사이의 값!
			System.out.println(num);
		} else {
			System.out.println("범위를 벗어났습니다.");
		}
		
		sc.close();
	}

	public static void method2() {
		/*
		 * 주민번호를 입력 받아 성별을 출력 ("남자", "여자")
		 * 단, -를 포함하여 입력받은 길이가 14자가 아닌 경우
		 * 	"잘못 입력되었습니다" 출력
		 * 
		 * * 문자열 길이 : 문자열.length()
		 * * 특정 위치의 한 문자만 추출 : 문자열.charAt(위치)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력 (-포함) : ");
		String ssn = sc.nextLine(); // "000000-0000000"
		// 7번째 자리 문자 -> 성별 구분 가능!
		// "남자" : '1', '3', "여자" : '2', '4'
		if (ssn.length() == 14) {
			char gender = ssn.charAt(7);	// '1', '2', '3', '4'
	
			if (gender == '1' || gender == '3') {
				System.out.println("남자");
			} else if (gender == '2' || gender == '4') {
				System.out.println("여자");
			} else {
				System.out.println("외국인");
			}
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
}






