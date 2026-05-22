package basicPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LetterOccurenceInString {

	public static void main(String[] args) {
		// Input: Pratima
		// Output: P: 1, r: 1, a: 2, t: 1, i: 1, m: 1

		String str = "google";
		// HashMap char as a key and occurrence as a value
		HashMap<Character, Integer> charCount = new LinkedHashMap<>();
		// for (int i = str.length() - 1; i >= 0; i--)
		for (int i = 0; i < str.length(); i++) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}

}
