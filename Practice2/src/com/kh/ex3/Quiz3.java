package com.kh.ex3;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 소문자를 저장할 char 변수 선언
		char a;
		
		// 소문자 입력받기
		System.out.print("소문자 입력 : ");
		String str = sc.next();			// a 입력 => "a"
		
		// 문자열 길이 : str.length()
		
		// 특정 위치의 한 문자를 추출 : 문자열.charAt(위치);
		//  * 위치 : 0부터 시작!		
		// "happy" -> "happy".charAt(0) => 'h'
		//         -> "happy".charAt(3) => 'p'
		//         -> "happy".charAt(4) => 'y'
		
		// str => "a"
		//   str.charAt(0) => 'a'
		a = str.charAt(0);
		
		//System.out.println("입력 받은 값 : " + str);
		//System.out.println("추출 한 값 : " + a);
		
		// 소문자를 대문자로 변환 (자료형)
		// 'a' = 97, 'A' = 65
		char result = (char)(a - 32);
		// a (char, 2B) - 32 (int, 4B)
		// a (char->int) - 32 => (int) :: 97 - 32 = 65
		
		// char result = 65
		
		System.out.println("소문자 : " + a);
		System.out.println("대문자 : " + result);
	}

}




