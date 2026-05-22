package basicPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 }; // Missing 3
		int n = 6; // The range is 1 to 6

		int missingNumber = findMissing(arr, n);
		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissing(int[] arr, int n) {
		// Step 1: Calculate expected sum of 1 to n
		int expectedSum = n * (n + 1) / 2;

		// Step 2: Calculate actual sum of array elements
		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}

		// Step 3: Difference is the missing number
		return expectedSum - actualSum;
	}
}
