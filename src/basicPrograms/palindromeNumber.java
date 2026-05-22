package basicPrograms;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome:");
		int num = scan.nextInt();
		int rev = 0;
		int div = num;
		while (div > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			div = num / 10;
		}

		System.out.println("Reverse of number is " + rev);

		if (num == rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
	}

}
