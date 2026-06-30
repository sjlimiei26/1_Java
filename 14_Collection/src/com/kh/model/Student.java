package com.kh.model;

public class Student {
	private String name;
	private int age;
	private double score;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	// name 필드의 getter 메소드
	public String getName() {
		return name;
	}
	// name 필드의 setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}



