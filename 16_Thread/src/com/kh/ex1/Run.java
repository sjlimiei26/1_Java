package com.kh.ex1;

public class Run {

	public static void main(String[] args) {
		System.out.println(" ---- 메인 스레드 시작 ----");

		// * Runnable 인터페이스를 통해 구현한 스레드
		Thread t1 = new Thread( new Task1() );
		t1.start();  // 스레드 실행!
		
		// * Thread 클래스를 상속시킨 스레드
		Task2 t2 = new Task2();
		t2.start();
		
		System.out.println(" ---- 메인 스레드 종료 ----");
	}

}
