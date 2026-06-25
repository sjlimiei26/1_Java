package com.kh.ex2;

public class BankAccount {
	private int balance;
	
	public BankAccount(int initialBalance) {
		this.balance = initialBalance;
	}
	
	/*
	 * 현재 잔액 확인 메소드
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 출금 기능. 현재 잔액에서 전달받은 금액(amount) 차감
	 * @param amount 출금 금액
	 */
	public void withdraw(int amount) throws NotEnoughBalanceException {
		// balance = balance - amount;
		if (balance < amount) {
			// 예외 발생 시키기!!!
			throw new NotEnoughBalanceException("[출금 오류 발생] 잔액이 부족합니다."
												, balance, amount);
		}
		
		
		balance -= amount;
		System.out.println("출금 완료! 남은 잔액: " + balance +"원");
	}

}





