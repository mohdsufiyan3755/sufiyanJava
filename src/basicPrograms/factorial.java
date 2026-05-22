package basicPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for factorial:");
		int number = scan.nextInt();
		int fact = 1;
		for (int i=2; i<=number; i++) {
			fact = fact*i;
		}
		System.out.println("factorial of "+number+" is "+fact);
	}

}
