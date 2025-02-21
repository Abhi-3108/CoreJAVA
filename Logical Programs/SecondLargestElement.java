package com.studenttribe.tasks;
public class SecondLargestElement {
    public static Integer secondLargest(int[] nums) {
        if (nums.length < 2) {
            return null;  // If there are fewer than 2 elements
        }

        // Initialize largest and second largest to the minimum possible values
        int largest = nums[0];
        int secondLargest = nums[0];

        // Find the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Reset second largest to the minimum possible value
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < largest) {
                secondLargest = nums[i];
                break;
            }
        }

        // Find the second largest element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }

        if (largest == secondLargest) {
            return null;  // If there is no second largest element
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 7, 0, 8};
        Integer secondLargestElement = secondLargest(array);
        if (secondLargestElement != null) {
            System.out.println("Second Largest Element: " + secondLargestElement);
        } else {
            System.out.println("No Second Largest Element found");
        }
    }
}
