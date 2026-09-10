package com.javaintro;

public class Test {
	byte employeeid=101;
	short  employeeage=21;
	double employeeSalary=285000;
	char employeeGrade='A';
	int yoe=2;
	boolean employeeActive=true;
	int numberofleaves=5;
	long phonenumber=9390302651L;
	int avi_leaves=12;
	 void apply() {
		 avi_leaves--;
		 
		 
		 
	 }
	

	public static void main(String[] args) {
		Test q1=new Test();
		q1.apply();
		q1.apply();
		System.out.println("The Employee ID is:"+q1.employeeid);
		System.out.println("The Employee AGE is:"+q1.employeeage);
		System.out.println("The Employee Salary is:"+q1.employeeSalary);
		System.out.println("The Employee Grade is:"+q1.employeeGrade);
		System.out.println("The Employee Yoe is:"+q1.yoe);
		System.out.println("The Employee Active is:"+q1.employeeActive);
		System.out.println("The Employee numberofleaves is:"+q1.numberofleaves);
		System.out.println("The Employee phonenumber is:"+q1.phonenumber);
		System.out.println("The Employee avi_leaves is:"+q1.avi_leaves);
		
	}

}
