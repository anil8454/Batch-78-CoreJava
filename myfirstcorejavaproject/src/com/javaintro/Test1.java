package com.javaintro;

public class Test1 {
	
	 static int a;
	 
	public static void main(String[] args) {
		// main method 
		System.out.println("main method started");
		
		System.out.println("main method ended");
		
		
		System.out.println(a);
		
	}
	
	// static block
	static {
		System.out.println("static block called");
		System.out.println("Welcome to JVM Architecture");
		System.out.println(a);
		
	}

}
