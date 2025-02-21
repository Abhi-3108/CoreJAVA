package com.studenttribe.tasks;
public class MissingNumber{

	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		int n=arr.length+1;
		int nsum =n*(n+1)/2;
		int sum=0;
		for(int arrsum: arr) {
			sum=arrsum+sum;
		}
		int missingnum=nsum-sum;
		
		System.out.println("Array total: "+nsum);
		
		System.out.println("Missing Number: "+missingnum);
		
	}
}
