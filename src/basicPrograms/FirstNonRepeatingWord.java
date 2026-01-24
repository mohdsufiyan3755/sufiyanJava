package basicPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingWord {

	public static void main(String[] args) {
		// First Non repeating word in a Sentence
		
		String sentence = "apple an banana a apple cherry banana grape";
        System.out.println("Sentence: " + sentence);
        
        String result = findFirstNonRepeatingWord(sentence);
        
        if (result != null) {
            System.out.println("First non-repeating word: " + result);
        } else {
            System.out.println("No non-repeating word found.");
        }
    }

    public static String findFirstNonRepeatingWord(String sentence) {
        // Split by whitespace
        String[] words = sentence.split("\\s+");
        
        // Use LinkedHashMap to maintain insertion order
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        // Count frequency of each word
        for (String word : words) {
            word = word.toLowerCase(); // Optional: treat "Apple" and "apple" as same
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Iterate through map to find the first word with count 1
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return null;
    }
}

