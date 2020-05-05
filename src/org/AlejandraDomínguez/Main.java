package org.AlejandraDomínguez;

public class Main {
	public static void main (String [] args) {
  /*create a single application
   * there should be a Bank class
   * it should have an arrayList of Customers
   * the Customer class should have an arrayList of doubles (transactions) 
   * Customer:
   * Name, and the arrayList of doubles
   * Branch 
   * need to be able to add a new customer and initial transaction amount.
   * also needs to add additional transactions for that customer/branch
   * Bank:
   * add a new branch
   * add a customer to that branch with initial transaction
   * Add a transaction for existing customer for that branch
   * Show a list of customers for a particular branch an optionally a list of their transactions
   * Demonstration autoboxing and unboxing in your code
   * Mint:transactions
   * Add data validation.
   * e.g. check if exists, or does not exist, etc.
   * think about where you are adding the code to perform certain actions*/
	
	Bank bank = new Bank("National Autralia Bank");
	
	if(bank.addBranch("Adelaide")){
	  System.out.println("Adelaide branch created");
	}
	
	bank.addCustomer("Adelaide", "Tim", 50.05);
	bank.addCustomer("Adelaide", "mike", 175.34);
	bank.addCustomer("Adelaide", "Percy", 220.12);
	
	bank.addBranch("Sydney");
	bank.addCustomer("Sydney", "Bob", 150.54);
	
	bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
	bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
	bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
	
	bank.listCustomers("Adelaide", true);
	bank.listCustomers("Sydney", true);
	
	bank.addBranch("Melboure");
	
	if(!bank.addCustomer("Melboure", "Brian", 5.53)) {
		System.out.println("Error Melboure branch does not exist.");
	}
	if(!bank.addBranch("Adelaide")) {
		System.out.println("Adelaide branch already exists.");
	}
	if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
		System.out.println("Customer dos not exist at branch.");
	}
	
	
	}
	
}
