package basicPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "apple an banana banana a cherry grape";
		System.out.println("Sentence: " + sentence);

		// Split by whitespace
		String[] words = sentence.split("\\s+");

		// Use LinkedHashMap to maintain insertion order
		Map<String, Integer> wordCountMap = new LinkedHashMap<>();

		// Count frequency of each word
		for (String word : words) {
			word = word.toLowerCase(); // Optional: treat "Apple" and "apple" as same
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		int[] arr = new int[wordCountMap.size()];
		int i = 0;
		while (i < wordCountMap.size()) {

			// Iterate through map to find the first word with count 1
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {

				arr[i] = entry.getValue();
				i++;
			}

		}
		Arrays.sort(arr);
		int a = arr[arr.length - 2];
		System.out.println(a);
		
	}
}
