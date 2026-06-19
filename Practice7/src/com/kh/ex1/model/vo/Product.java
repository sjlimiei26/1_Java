package com.kh.ex1.model.vo;

public class Product {
	// - productName:String
	// 접근제한자 예약어 자료형 변수명;
	private String productName;
	// - price:int
	private int price;
	// - brand:String
	private String brand;
	
	// + Product()
	public Product() {
		
	}
	
	// + getProductName():String
	// 접근제한자 예약어 반환형 메소드명(매개변수) { }
	public String getProductName() {
		return this.productName;
	}
	// + setProductName(productName:String):void
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	// price getter -> 해당 필드의 값을 반환하는 메소드
	public int getPrice() {
		return this.price;
	}
	// price setter -> 해당 필드에 전달받은 값을 저장하는 메소드
	public void setPrice(int price) {
		this.price = price;
	}
	
	// brand getter
	public String getBrand() {
		return this.brand;
	}
	// brand setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// + information():void
	public void information() {
		// "갤럭시 / 10000 / 삼성" 형식으로 출력
		System.out.println(this.productName + " / "
							+ this.price + " / "
							+ this.brand);
//		 System.out.printf("%s / %d / %s\n"
//						, this.productName, this.price, this.brand);
	}
	
}






