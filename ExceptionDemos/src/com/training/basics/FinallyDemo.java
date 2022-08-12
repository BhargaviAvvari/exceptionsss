package com.training.basics;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
System.out.println("Welcome");
String Value =args[0];
System.out.println("value got");
int num =Integer.parseInt(Value);
System.out.println("Numbe is "+num);
int result =100/num;
System.out.println("result is "+result);
		}
		/*
		 * catch(Exception e) { System.out.println("error"); }
		 */
		finally {
			System.out.println("closing db");
		}
		System.out.println("completed");
	}

}
