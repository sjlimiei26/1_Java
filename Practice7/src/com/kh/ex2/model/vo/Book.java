package com.kh.ex2.model.vo;

/**
 * 
 */
public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 기본생성자
	public Book() {
		
	}
	// 매개 변수가 3개인 생성자 => title, publisher, author
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	// 매개 변수가 5개인 생성자 => 모든 필드
	public Book(String title, String publisher, String author,
						int price, double discountRate) {
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		this(title, publisher, author);
		
		this.price = price;
		this.discountRate = discountRate;
	}
	

	// title getter/setter
	// Alt + Shift + S > r	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void inform() {
		
		System.out.printf("도서명: %s 저자명: %s 출판사: %s 가격: %d 할인율: %.2f\n"
					, this.title, this.author, this.publisher, this.price, this.discountRate);
		
	}
	

}





