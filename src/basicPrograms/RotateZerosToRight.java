package basicPrograms;

import java.util.Arrays;

public class RotateZerosToRight {

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // Pointer to track the position of the next non-zero element
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero
            if (nums[i] != 0) {
                // Place it at the nonZeroIndex position and increment the index
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions from nonZeroIndex to the end with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(arr1));
        moveZeroes(arr1);
        System.out.println("Modified array: " + Arrays.toString(arr1)); // Expected output: [1, 3, 12, 0, 0]

        int[] arr2 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Original array: " + Arrays.toString(arr2));
        moveZeroes(arr2);
        System.out.println("Modified array: " + Arrays.toString(arr2)); // Expected output: [1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0]
    }
}
