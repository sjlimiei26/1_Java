package com.kh.model;
//   - 학생 클래스 (Student) com.kh.model.Student
//  -----------------------
//     - name:String
//     - age:int
//     - score:double
//  -----------------------
//     + Student()
//     + Student(name:String, age:int, score:double)
//     + getter/setter
//     + printInfo():void
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
	
	public void printInfo() {
		System.out.println(name + ", " + age + ", " + score);
	}
	
}



