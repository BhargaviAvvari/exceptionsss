package com.training.userexception;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super();
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}

}
