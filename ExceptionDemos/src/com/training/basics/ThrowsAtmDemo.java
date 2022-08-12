package com.training.basics;

public class ThrowsAtmDemo {

	public static void main(String[] args) {
		System.out.println("in atm");
Bank bank=new Bank();
try {
	bank.withDraw(7000);
} catch (Exception e) {
	e.printStackTrace();
}
System.out.println("Amount withdrawn");
System.out.println("Goodbye");
	}

}
