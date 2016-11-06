package com.bank.client;

import com.bank.facade.IBank;
import com.bank.facade.factory.BankFactory;

public class BankClient {

	public static void main(String[] args) {
		IBank bank = BankFactory.getBank();
		
		System.out.println("Before transfer - Balance of account n°1 : " + bank.getBalance(1L) + "€");
		System.out.println("Before transfer - Balance of account n°2 : " + bank.getBalance(2L) + "€");
		
		System.out.println("Tranfer of 100€ from account n°1 to account n°2");
		bank.transfer(100, 1L, 2L);
		
		System.out.println("After transfer - Balance of account n°1 : " + bank.getBalance(1L) + "€");
		System.out.println("After transfer - Balance of account n°2 : " + bank.getBalance(2L) + "€");
	}

}
