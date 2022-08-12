package com.training.basics;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
			String Value =args[0];
			System.out.println("value got");
			int num =Integer.parseInt(Value);
			System.out.println("Numbe is "+num);
			int result =100/num;
			System.out.println("result is "+result);
			int[] marks =null;
			System.out.println(marks[0]);
					}catch(ArithmeticException e) {
						System.out.println("please enter the number greater than zero");
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("please enter the value");
					}catch(NumberFormatException e) {
						System.out.println("please enter the number ");
					}catch(Exception e) {
						System.out.println("please enter the number ");
					}
					System.out.println("completed");
				}

}
