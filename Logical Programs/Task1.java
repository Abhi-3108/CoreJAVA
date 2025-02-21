package com.studenttribe.tasks;

public class Task1 {
	static int no=1;
	String name="abhi";
	
	static public void pdetails() {
		System.out.println("Static");
		
	}
	public void education() {
		System.out.println("education_non-static");
		
	}
	static void joy() {
		System.out.println("Static Method calling Static variable and method"
				+ "And Non-Static variable and method:");
		System.out.println(no);
//        System.out.println(name);
		Task1.pdetails();
		Task1 t1=new Task1();
		t1.education();
	}
	public void abhi() {
		System.out.println("Non Static Method calling Static variable and method"
				+ "And Non-Static variable and method:");
		System.out.println(no);
		System.out.println(name);
		Task1.pdetails();
		
	}
	static {
		System.out.println("Static Block");
		System.out.println("Student Details: ");
	}
	{
		System.out.println("Non Static Block:");
	}

	public static void main(String[] args) {
		Task1.pdetails();
		Task1 t2=new Task1();
		t2.education();
		Task1.joy();
		Task1 t3=new Task1();
		t3.abhi();
		
	
//		System.out.println(name);
		
		

	}

}
