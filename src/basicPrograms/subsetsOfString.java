package basicPrograms;

public class subsetsOfString {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length();
		int temp = 0;
		// Total possible subsets is n*(n+1)/2
		String arr[] = new String[len * (len + 1) / 2];

		// Outer loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// Inner loop adds next character to the subset
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}

		// Print all subsets
		System.out.println("All subsets for the given string are: ");
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
