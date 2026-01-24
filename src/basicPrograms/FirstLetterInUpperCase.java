package basicPrograms;

import java.util.Scanner;

public class FirstLetterInUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scan.nextLine();
		//String str = "there is a cat under the table";
		String temp= "";
		String[] s2 = str.split(" ");
		for(int i= 0; i<s2.length; i++) {
		String upperCase = s2[i].substring(0, 1).toUpperCase() + s2[i].substring(1);	
		//System.out.println(upperCase);
		temp = temp+" "+upperCase;
		}
		System.out.println(temp.trim());
		
		//We can use StringUtils.capitalize(" ") method for sequence of strings
		
//		String str1 = "there ia cat under the table";
//		String[] s2 = str.split(" ");
//		for(int i= 0; i<s2.length; i++) {
//			System.out.println(StringUtils.capitalize(s2[i]));
//		}
	}

}
