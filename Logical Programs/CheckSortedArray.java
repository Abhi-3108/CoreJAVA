package com.studenttribe.tasks;
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 5};
        boolean Sorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                Sorted = false;
                break;
            }
        }

        System.out.println("The array is Sorted: " + Sorted);
    }
}