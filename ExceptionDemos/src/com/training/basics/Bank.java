package com.training.basics;

public class Bank {

	void withDraw(int amount) throws Exception {
	System.out.println("in bank");
	try {
		if (amount>6000) {
			throw new Exception("exceed limit");
		}
		System.out.println("balance amount");
	}
	catch(Exception e) {
		System.out.println(e);
	System.out.println(e.getMessage());
	throw e;
	}finally {
		System.out.println("close db");
	}
	System.out.println("server completed");
	}
	
	}


