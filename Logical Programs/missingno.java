package com.studenttribe.tasks;

public class missingno {
	public static void main(String[] args) {
		int sum=0;
		int a[]= {14,15,17,18,20,22};
		int len= a.length;
		try {
		for(int i=0;i<len-1;i++) {
			if((a[i+1]-a[i])>1) {
				int missing =a[i]+1;
				System.out.println("Missing num is:"+missing);
			}
			
		}}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("I can handle"+ex);
		}
	}
			
}


