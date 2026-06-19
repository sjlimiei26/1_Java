package com.kh.ex3;

import java.util.Arrays;

public class Quiz3 {

	public static void main(String[] args) {

		// 크기가 10인 정수형 배열 선언
		int[] arr = new int[10];
		
		// 1 ~ 100 사이의 랜덤값으로 배열 초기화
		// => 배열 크기만큼 반복문을 통해 첫번째 칸부터 랜덤값을 대입 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		// 정렬 전 배열 내용 출력
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		// 오름 차순 정렬
		for(int i = 0; i < arr.length; i++) {
			
			// i번째 값과 (i+1)번째 위치부터 마지막 위치까지 비교
			for(int j=i+1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
		}
		
		// 정렬 후 배열 내용 출력
		System.out.println("정렬 후 : " + Arrays.toString(arr));
	}

}
