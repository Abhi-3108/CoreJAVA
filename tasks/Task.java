package com.studenttribe.tasks;
class Task extends Task2{
		Task(){
			System.out.println("Child class Default constructor");
		}
		Task(double marks){
			super(marks);	
			
		}
		Task(int no,String name,double marks){
			System.out.println("Child class parameterized constructor");
			this.no=no;
			this.name=name;
			
			
		}
		public void display() {
			System.out.println("Student no:"+no);
			System.out.println("Student name: "+name);
			System.out.println("Student marks: "+marks);
		}
	public static void main(String[] args) {
		new Task();
		Task t=new Task(1,"Abhishek",99);
		t.display();
	}
		

	}
