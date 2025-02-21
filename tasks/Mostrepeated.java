package com.studenttribe.tasks;
public class Mostrepeated {
    public static int result(int[] array) {
        int count = 0;
        int element = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            } else if (count == 0) {
                element = array[i];
                count = 1;
            } else {
                count--;
            }
        }

        return element;
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 2, 3, 3, 3, 4, 4};
        System.out.println("Majority Element: " + result(array));
    }
}
