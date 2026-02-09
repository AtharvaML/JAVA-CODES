package com.bankApp;

import java.util.HashMap;

public class Bank {
	
	private HashMap<Long, Account> accounts = new HashMap<>();

    public void addAccount(Account acc) {
        accounts.put(acc.getAccountNumber(), acc);
    }

    public Account getAccount(long accNo) {
        return accounts.get(accNo);
    }
}
