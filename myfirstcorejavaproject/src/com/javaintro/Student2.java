package com.javaintro;

public class Student2 {
	String Name;
	 int Age;
	 String College;
	 
	 void dispaly() {
		 System.out.println("The Name:"+Name);
		 System.out.println("The Age :"+Age);
		 System.out.println("The Nameof College:"+College);
	 }
	public static void main(String[] args) {
		Student2 s2=new Student2();
		 s2.Name="anil";
		 s2.Age=21;
		 s2.College="PSCMR CET";
		 s2.dispaly();
		// TODO Auto-generated method stub

	}

}
