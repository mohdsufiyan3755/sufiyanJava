package basicPrograms;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		
		//Using for loop
		String reverseString = "";
		char ch;
		for(int i=str.length()-1; i>=0; i--) {
			ch = str.charAt(i);
			reverseString = reverseString + ch;
		}
		System.out.println("Reverse String = "+reverseString);
		if(str.equalsIgnoreCase(reverseString)) {
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}

	}

}
