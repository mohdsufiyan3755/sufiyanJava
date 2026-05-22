package arrayPrograms;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
//		function();
		withoutFunction();
		
	}
		public static void function() {
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        // Create a new array with combined length
        int[] merged = new int[arr1.length + arr2.length];

        // Copy first array
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        // Copy second array starting after the first one
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        System.out.println("Merged Array: " + Arrays.toString(merged));
		
    }
		public static void withoutFunction() {
			int arr1[] = { 10, 20, 30 };
	        int arr2[] = { 40, 50, 60, 70, 80 };

	        // determining length of both arrays
	        int a1 = arr1.length;
	        int b1 = arr2.length;

	        // resultant array size
	        int c1 = a1 + b1;

	        // Creating a new array
	        int[] c = new int[c1];

	        // Loop to store the elements of first
	        // array into resultant array
	        for (int i = 0; i < a1; i = i + 1) {

	            // Storing the elements in
	            // the resultant array
	            c[i] = arr1[i];
	        }

	        // Loop to concat the elements of second
	        // array into resultant array
	        for (int i = 0; i < b1; i = i + 1) {

	            // Storing the elements in the
	            // resultant array
	            c[a1 + i] = arr2[i];
	        }

	        System.out.println("Merged Array is : " + Arrays.toString(c));
	    }
		

	}

