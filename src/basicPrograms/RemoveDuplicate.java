package basicPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check duplicate character");
		String str = scan.next();
		
//		int j=0;
//		char[] chararr = str.toCharArray();
//		for(int i=0; i<str.length()-1; i++) {
//			if(chararr[i]!=chararr[i+1]) {
//				chararr[j]=chararr[i];
//				j++;
//			}
//		}
//		chararr[j]= chararr[str.length()-1];
//		for(char a: chararr) {
//			System.out.println(chararr);
//		}

		char[] chararr = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for(char x: chararr) {
			hs.add(x);			
		}
		String result = hs.toString();
        System.out.println(result);
//		for(char z: hs) {
//		System.out.println(z);
		}
	}


