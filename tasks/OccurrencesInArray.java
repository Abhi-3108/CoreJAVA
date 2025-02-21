package com.studenttribe.tasks;
public class OccurrencesInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,3,4,1,2,3,1};
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (array[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = -1; 
                    }
                }
                System.out.println( + array[i] + " occurs " + count + " times.");
            }
        }
    }
}