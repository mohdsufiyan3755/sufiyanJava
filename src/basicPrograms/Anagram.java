package basicPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String str1 = scanner.nextLine();

		System.out.println("Enter the second string:");
		String str2 = scanner.nextLine();

		if (isAnagram(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}

		scanner.close(); // Close the scanner to prevent resource leaks
	}

	/**
	 * Checks if two strings are anagrams of each other.
	 * 
	 * @param s1 The first string.
	 * @param s2 The second string.
	 * @return true if the strings are anagrams, false otherwise.
	 */
	public static boolean isAnagram(String s1, String s2) {
		// Convert to lowercase and remove spaces for a more robust comparison
		String processedS1 = s1.replaceAll("\\s", "").toLowerCase();
		String processedS2 = s2.replaceAll("\\s", "").toLowerCase();

		// Check if lengths are different
		if (processedS1.length() != processedS2.length()) {
			return false;
		}

		// Convert strings to character arrays
		char[] arr1 = processedS1.toCharArray();
		char[] arr2 = processedS2.toCharArray();

		// Sort the character arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare the sorted arrays
		return Arrays.equals(arr1, arr2);
	}
}
