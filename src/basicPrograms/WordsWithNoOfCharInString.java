package basicPrograms;

public class WordsWithNoOfCharInString {

	public static void main(String[] args) {
		// Print "This is my Java  program" in the format-This-4,is-2,my-2...etc
		String str= "This is my Java program";
		String result = "";
		String [] strArr = str.split(" ");
		for (String str1 : strArr) {
			int count = str1.length();
			String temp = str1+"-"+count;
//			System.out.println(temp);
			result = result + temp+",";
		}
		System.out.println(result);

	}

}
