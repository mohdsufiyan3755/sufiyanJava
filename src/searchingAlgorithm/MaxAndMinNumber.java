package searchingAlgorithm;

import java.util.Scanner;

public class MaxAndMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Array of " + n + " elements is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("\nMaximum number is: " + max);
	}
}
