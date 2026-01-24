package basicPrograms;

import java.util.Scanner;

public class primeNumbereEtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primeno();	
	//	pattern();
	//	factorial();
	//	even();
	//	fibonacci();
	  //armstrong();	
		}

	private static void armstrong() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong number");
		int number = scan.nextInt();
		int temp = number;
		int sum=0;
		if (temp>0) {
			temp=temp%10;
			sum= sum*10+temp*temp*temp;
			temp=temp/10;
		}
		if (sum==number) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
	}
	private static void fibonacci() {
		int n1=0, n2=1;
		System.out.print(n1+" "+n2);
		for (int i=2; i<=10; i++) {
			int n3 = n1 + n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}
	}
	private static void primeno() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check prime or not?");
		int number = scan.nextInt();
		int count=0;
		if (number==1 || number==0) {
			System.out.println("Invalid number.Prime numbers starts with 2");
		}
		for (int i=2; i<number; i++) { 
			if(number%i==0) {
				count++;
			}	
			}
			if (count>0) {
				System.out.println("Number "+number+" is not a Prime Number");
			}
			
		else {
			System.out.println("Number "+number+" is a Prime Number");
		
		}
	}


// pattern program
	private static void pattern() {
	for (int i=1; i<=4; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
 // factorial
	private static void factorial() {
    
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		int number = scan.nextInt();
		int fact=1;
		for (int i= 2; i<=number; i++) {
			fact= fact*i;
			
		}

		System.out.println("Factorial of a number "+number+" is "+fact);
	}
// Even number

   private static void even() {
	   
   for (int i=0; i<=20; i++) {
	   if (i%2==0) {
		   System.out.print(i+" ");
	   }
	   
   }




	}
}
