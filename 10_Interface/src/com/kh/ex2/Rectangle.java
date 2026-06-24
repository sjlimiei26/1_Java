package com.kh.ex2;

public class Rectangle implements Shape {
	private double w;  // 가로 
	private double h;  // 세로
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double calculateArea() {
		// 가로 x 세로
		return w * h;
	}
	
}
