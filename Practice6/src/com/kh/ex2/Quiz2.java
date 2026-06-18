package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {
	/*
	 * 과일이 있는 경우 *
	   찾을 과일 이름을 입력하세요 : 바나나
	   바나나는 배열의 2번 인덱스에 있습니다.
	   
	 * 과일이 없는 경우 *
		찾을 과일 이름을 입력하세요 : 수박
		찾는 과일이 없습니다.	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// * 과일 목록 초기화 : {"사과", "딸기", "바나나", "키위", "복숭아"}
		String[] fruits = {"사과", "딸기", "바나나", "키위", "복숭아"};
		
		
		System.out.print("찾을 과일 이름을 입력하세요 : ");
		String fName = sc.nextLine();
		
		// 과일 목록에서 찾을 과일 찾기
		// => 배열에서 입력받은 값과 일치하는 항목 찾기!
		int fIndex = -1; // 일치하는 과일을 찾았을 경우 해당 인덱스를 저장
		
		for(int i=0; i<fruits.length; i++) {
			
			// fruits[i] => i번째 위치의 값 => 문자열
			
			boolean isEquals = fruits[i].equals(fName);
			// i번째 값과 입력받은 값이 일치한다면 => true
			//				그렇지 않으면 => false
			if(isEquals) {
				fIndex = i;
				break;			// 찾으면 반복문 종료!
			}
		}
		
		// 찾았을 경우 "{n}번째 인덱스에 있습니다" 출력
		//   없을 경우 "찾는 과일이 없습니다" 출력
		if (fIndex > -1) { // fIndex != -1
			System.out.println(fName + "은 배열의 " + fIndex + "번 인덱스에 있습니다");
		} else {
			System.out.println("찾는 과일이 없습니다");
		}
	}

}











