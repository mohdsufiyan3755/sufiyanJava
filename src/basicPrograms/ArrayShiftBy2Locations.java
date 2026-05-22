package basicPrograms;

import java.util.Arrays;

public class ArrayShiftBy2Locations {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2; // Number of positions to shift

		// Create a temporary array to store the first 'd' elements
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		// Shift the remaining elements to the left
		for (int i = d; i < n; i++) {
			arr[i - d] = arr[i];
		}

		// Copy the elements from the temporary array back to the original array's end
		for (int i = 0; i < d; i++) {
			arr[n - d + i] = temp[i];
		}

		System.out.println("Original Array: " + "[1, 2, 3, 4, 5, 6, 7]");
		System.out.println("Left Shifted by 2: " + Arrays.toString(arr)); // Output: [3, 4, 5, 6, 7, 1, 2]
	}

}
