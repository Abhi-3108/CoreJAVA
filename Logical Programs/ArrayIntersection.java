package com.studenttribe.tasks;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] abhi= {1,2,3,4};
		int[] joy= {3,4,5,6};
		
		Set<Integer> a1=new HashSet<>();
		 for(int n : abhi) {
			 a1.add(n);
		 }
		 
		 Set<Integer> intersection=new HashSet<>();
		 for(int n: joy) {
			 if(a1.contains(n)) {
				 intersection.add(n);
			 }
		 }
		
         System.out.println(intersection);
	}

}
