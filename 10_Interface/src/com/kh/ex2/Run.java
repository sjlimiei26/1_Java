package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 배열 생성
		// [ 원(반지름:5), 사각형(가로:3,세로:4) ]
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(5);
		arr[1] = new Rectangle(3, 4);
		
		// Shape[] arr2 = { new Circle(5), new Rectangle(3, 4) };
		
		
		// 출력
		/*
			원의 넓이 : 0000
			사각형의 넓이 : 0000
		 */
		for(Shape s : arr) {
			
			if (s instanceof Circle) {
				
				System.out.print("원의 넓이 : ");
				
			} else if (s instanceof Rectangle ) {
				
				System.out.print("사각형의 넓이 : ");
				
			}
			
			
			System.out.println( s.calculateArea() );
			
		}

	}

}
