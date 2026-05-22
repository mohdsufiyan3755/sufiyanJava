package basicPrograms;

import java.util.Scanner;

public class CaseCounter {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a sentence or word:");
        String input = scan.nextLine();
        scan.close();

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        // Iterate through each character of the string
        for (char character : input.toCharArray()) {
            if (Character.isUpperCase(character)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(character)) {
                lowercaseCount++;
            }
            // Optional: add else if (Character.isDigit(character)) to count digits,
            // or an else block to count other characters like whitespace or symbols.
        }

        // Print the results
        System.out.println("Uppercase letters: " + uppercaseCount);
        System.out.println("Lowercase letters: " + lowercaseCount);
    }

}
