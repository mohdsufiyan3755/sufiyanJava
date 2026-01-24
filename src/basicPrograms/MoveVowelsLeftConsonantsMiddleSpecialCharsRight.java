package basicPrograms;

public class MoveVowelsLeftConsonantsMiddleSpecialCharsRight {

	public static void main(String[] args) {
		String vowels, consonants, specialCharacters;
		vowels=consonants=specialCharacters="";
		String str= "kjsfkji@*7^ieez?'sd";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
			vowels= vowels+str.charAt(i);
			}
			else if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				specialCharacters= specialCharacters+ str.charAt(i);
			}
			else {
				consonants = consonants+str.charAt(i);
			}
		}
		String newStr = vowels+consonants+specialCharacters;
		System.out.println(newStr);
 
	}

}
