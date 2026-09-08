package com.javaintro;

public class Customer {
	int customerId;
	String customerName;
	double customeroderPrice;
	
	
	static  int customerIdGen =100;
	
	{
		
	customerIdGen++;
	customerId=customerIdGen;
		
	}
	void display() {
		System.out.println("customerId: " + customerIdGen);
        System.out.println("customerName: " + customerName);
        System.out.println("customeroderPrice: " +customeroderPrice);
        System.out.println("----------------------");
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.customerName="anil";
		c1.customeroderPrice=300000;
		c1.display();
		
		
		Customer c2 = new Customer();
		c2.customerName="sai";
		c2.customeroderPrice=4000000;
		c2.display();
		
		
	}

}