package basicPrograms;

import java.util.Arrays;

public class KthLargestKthSmallest {

	public static int findKthSmallest(int[] nums, int k) {
		// Sort the array in ascending order
		Arrays.sort(nums);
		// The Kth smallest element is at index K-1
		return nums[k - 1];
	}

	public static int findKthLargest(int[] nums, int k) {
		// Sort the array in ascending order
		Arrays.sort(nums);
		// The Kth largest element is at index nums.length - K
		return nums[nums.length - k];
	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;

		System.out.println("Kth smallest element is: " + findKthSmallest(arr, k));
		// Reinitialize or copy the array for the largest element search if needed
		int[] arr2 = { 7, 10, 4, 3, 20, 15 };
		System.out.println("Kth largest element is: " + findKthLargest(arr2, k));
	}
}
