	package com.javaintro;

	public class BankAccount {

	   
	    int Accno;
	    String accountHolderName;
	    double balance;

	    
	    static int accountNoGenerater = 1000;

	    
	    {
	        accountNoGenerater++;
	        Accno = accountNoGenerater;
	    }

	    void display() {
	        System.out.println("Account No: " + Accno);
	        System.out.println("Account Holder Name: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	        System.out.println("----------------------");
	    }

	    public static void main(String[] args) {

	        BankAccount b1 = new BankAccount();
	        b1.accountHolderName = "Anil";
	        b1.balance = 50000;

	        BankAccount b2 = new BankAccount();
	        b2.accountHolderName = "Rahul";
	        b2.balance = 30000;

	        BankAccount b3 = new BankAccount();
	        b3.accountHolderName = "Suresh";
	        b3.balance = 45000;

	        b1.display();
	        b2.display();
	        b3.display();
	    }
	}