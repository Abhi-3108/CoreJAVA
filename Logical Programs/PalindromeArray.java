package com.studenttribe.tasks;
public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The Array is a Plaindrome:" + isPalindrome);
    }
}