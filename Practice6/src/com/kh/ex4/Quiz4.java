package com.kh.ex4;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 길이가 10인 정수형 배열 선언
		int[] arr = new int[10];
		
		// 1 ~ 100 사이의 랜덤값으로 배열 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		// 짝수 및 홀수 개수 확인
		int evenCount = 0;
		int oddCount = 0;
		
		for(int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		// 결과 출력
		System.out.println("생성된 배열 : " + Arrays.toString(arr));
		System.out.println("짝수의 개수 : " + evenCount);
		System.out.println("홀수의 개수 : " + oddCount);

	}

}
