package arrayPrograms;

import java.util.Arrays;

public class ArrayEqualityCheck {
	
	public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {10, 20, 30, 50}; // Different element

        // Compare arr1 and arr2
        boolean areEqual1 = Arrays.equals(arr1, arr2);
        System.out.println("Are arr1 and arr2 equal? " + areEqual1); // Output: true

        // Compare arr1 and arr3
        boolean areEqual2 = Arrays.equals(arr1, arr3);
        System.out.println("Are arr1 and arr3 equal? " + areEqual2); // Output: false
    }

}
