package com.kh.ex2;

public class Circle implements Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	// double calculateArea();
	public double calculateArea() {
		// 파이x반지름x반지름
		return Math.PI * r * r;
	}
	
}
