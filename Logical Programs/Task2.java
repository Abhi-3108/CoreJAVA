package com.studenttribe.tasks;

 public class Task2 {
	int no;
	String name;
	double marks;
	Task2(){
		System.out.println("Default Constructor");
	}
	Task2(double marks){
		this.marks=marks;
	}
	Task2(int no, String name){
		this(no);
		System.out.println("Parameterized Constructor");
		this.name=name;
	}
	
}
	
