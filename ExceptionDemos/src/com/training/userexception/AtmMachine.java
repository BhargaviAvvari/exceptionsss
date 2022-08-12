package com.training.userexception;

public class AtmMachine {
	public static void main(String[] args) {
		Bank2 bank=new Bank2(6000);
		try {
			bank.withDraw(20000);
			System.out.println("amount withdrawn");
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (ExceedingLimitException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("comlpeted");
	}
}
