package org.AlejandraDomínguez;

import java.util.ArrayList;

public class Customer {

	private String name;
	private ArrayList<Double> transactions;

	/*----------------------------------------------------------------------------------------
	 * -------------------------------constructor---------------------------------------------
	 * -------------------------------------------------------------------------------------*/
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialAmount);
	}
	
	/*----------------------------------------------------------------------------------------
	 * ------------------------method to add a transaction------------------------------------
	 * -------------------------------------------------------------------------------------*/
	public void addTransaction (double amount) {
		this.transactions.add(amount);
	}

	/*----------------------------------------------------------------------------------------
	 * -------------------------------getters-------------------------------------------------
	 * -------------------------------------------------------------------------------------*/
	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
}
