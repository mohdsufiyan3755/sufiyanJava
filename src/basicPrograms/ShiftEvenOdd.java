package basicPrograms;

import java.util.Arrays;

public class ShiftEvenOdd {
	// Shift even numbers to the left and odd numbers to the right in an array
	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 9, 8, 90, 3 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		segregateEvenOdd(arr);

		System.out.println("Rearranged Array: " + Arrays.toString(arr));
	}

	public static void segregateEvenOdd(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			// Increment left index while we see an even number
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}

			// Decrement right index while we see an odd number
			while (arr[right] % 2 != 0 && left < right) {
				right--;
			}

			// If left is still less than right, swap the even and odd numbers
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

}
