package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordOccurences {

	public static void main(String[] args) {
		// String str ="I am Java developer I am proud of it";
		// Output: Java: 1, proud: 1, of: 1, I: 2, developer: 1, it: 1, am: 2

		// Declaring the String
        String str = "Alice is girl boy and Bob is boy Bob";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();
 
        // Splitting the words of string
        // and storing them in the array.
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);
 
            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }

	}

