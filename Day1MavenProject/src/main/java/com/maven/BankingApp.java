package com.maven;

public class BankingApp {

	public static void main(String[] args) {
		SavingAccount sa= new SavingAccount(3456787,"ravi","ICICII","ICICI09098","BANGLORE",1000);
		System.out.println(sa);
		sa.withDraw(5000);
		sa.deposit(20000);
		System.out.println(sa.getBalance());
	}

}
