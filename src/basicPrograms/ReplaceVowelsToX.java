package basicPrograms;

public class ReplaceVowelsToX {

	public static void main(String[] args) {
		
		String str = "Uufiyan";
		StringBuilder result = new StringBuilder();
		for (char ch : str.toCharArray()) {
			if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
				result.append('x');
			}
			else {
				result.append(ch);
			}
		}
		System.out.println(result);

	}

}
