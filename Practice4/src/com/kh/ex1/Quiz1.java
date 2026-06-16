package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : "); 
		int menu = sc.nextInt();
		
		// menu 값이 1 인 경우 -> "입력 메뉴입니다" 출력
		//			2 인 경우 -> "수정 메뉴입니다" 출력
		//  ...     7 인 경우 -> "프로그램을 종료합니다" 출력
		if (menu == 1) {
			System.out.println("입력 메뉴입니다");
		} else if (menu == 2) {
			System.out.println("수정 메뉴입니다");
		} else if (menu == 3) {
			System.out.println("조회 메뉴입니다");
		} else if (menu == 4) {
			System.out.println("삭제 메뉴입니다");
		} else if (menu == 7) {
			System.out.println("프로그램을 종료합니다");
		} else {
			System.out.println("없는 메뉴입니다");
		}
		
		// ------------------------------
		
		switch(menu) {
		case 1: 
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			System.out.println("없는 메뉴입니다");
			break;
		}

	}

}
