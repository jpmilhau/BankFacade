package com.bank.facade.factory;

import com.bank.facade.IBank;
import com.bank.facade.impl.BankImpl;

public class BankFactory {

	public static IBank getBank() {
		return new BankImpl();
	}
}
