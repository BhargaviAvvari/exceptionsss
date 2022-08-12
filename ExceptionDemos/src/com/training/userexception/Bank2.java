package com.training.userexception;

public class Bank2 {
	double balance;

	public Bank2(double balance) {
		super();
		this.balance = balance;
	}

void withDraw(int amount) throws InsufficientBalanceException,ExceedingLimitException{
try {
if(amount>balance) {
	throw new InsufficientBalanceException("Amount> than balance");	
}
if(amount>10000) {
	throw new ExceedingLimitException("Exceeding day limits");
}else {
	balance =balance-amount;
System.out.println("amount withdrawn");
System.out.println("balance is "+balance);
}


}catch (Exception e) {

System.out.println("exception " +e);
throw e;
}finally{
	System.out.println("close");
}

}
}