package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFinder {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 5, 4, 4, 9, 7, 8, 2, 6, 4};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each number
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates and their frequency
        System.out.println("Duplicates and their frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number: " + entry.getKey() + " | Frequency: " + entry.getValue());
            }
        }
    }

}
