package com.javaintro;

public class Method {
	static void method1() {
		System.out.println("Call The Method 1");
		method2();
	}
	static void method2() {
		System.out.println("Call The Method 2");
		Method obj =new Method();
		obj.method3();
	}
	void method3() {
		System.out.println("Call The Method 3");
		method4();
	}
	void method4() {
		System.out.println("Call The Method 4");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is four methods calling :");
		// TODO Auto-generated method stub
		method1();
	}

}
