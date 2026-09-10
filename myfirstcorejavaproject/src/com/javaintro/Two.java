package com.javaintro;

public class Two {
 static void method1() {
	 System.out.println("This is method 1 of static Block");
 }
 static void method2() {
	 System.out.println("This is method 2 of static Block");
 }
	 void  instancemethod1() {
		 System.out.println("This is method 1 of instance Block");
		 
	 }
	 void  instancemethod2() {
		 System.out.println("This is method 2 of instance Block");
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
		Two t1=new Two();
		t1.instancemethod1();
		t1.instancemethod2();
		

	}

}
