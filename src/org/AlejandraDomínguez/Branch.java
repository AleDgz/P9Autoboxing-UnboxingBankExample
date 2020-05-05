package org.AlejandraDomínguez;

import java.util.ArrayList;

public class Branch {

	private String name;
	private ArrayList<Customer> customer;
	
	public Branch(String name) {
		this.name = name;
		this.customer = new ArrayList<Customer>(); 
	}
	
	public String getName() {
		return name;
	}
	
	public boolean newCustumer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.customer.add(new Customer(customerName,initialAmount));
			return true;
		}
		return false;
	}
	
	public boolean addCustumerTransaction(String customerName, double amount ) {
		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.addTransaction(amount);
		return true;
		}
		return false;
	}
	
	
	private Customer findCustomer(String customerName) {
		for(int i =0;i<this.customer.size();i++) {
			Customer checkCustomer = this.customer.get(i);
			if(checkCustomer.getName().equals(customerName)) {
				return checkCustomer;
			}
		}
		return null;
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	
	
}
