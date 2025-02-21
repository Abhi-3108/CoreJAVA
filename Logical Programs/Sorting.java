package com.studenttribe.tasks;
public class Sorting {
    public static void sorting(int[] arr) {
        int n = arr.length;
        int[] nonZeroElements = new int[n];
        int j = 0;
        for (int num : arr) {
            if (num != 0) {
                nonZeroElements[j++] = num;
            }
        }
        for (int i = 0; i < j - 1; i++) {
            for (int k = 0; k < j - i - 1; k++) {
                if (nonZeroElements[k] > nonZeroElements[k + 1]) {
                    int temp = nonZeroElements[k];
                    nonZeroElements[k] = nonZeroElements[k + 1];
                    nonZeroElements[k + 1] = temp;
                }
            }
        }
        for (int i = 0; i < j; i++) {
            arr[i] = nonZeroElements[i];
        }
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 7, 0, 8};
        sorting(array);
        System.out.println("Sorted Array with Zeros at End: " + java.util.Arrays.toString(array));
    }
}
