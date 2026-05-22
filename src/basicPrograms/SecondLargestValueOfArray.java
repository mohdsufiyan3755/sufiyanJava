package basicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestValueOfArray {
	    public static int findSecondLargestUsingMap(int[] arr) {
	        // Use a HashSet to store only the distinct elements
	        Set<Integer> distinctElements = new HashSet<>();
	        for (int num : arr) {
	            distinctElements.add(num);
	        }

	        // Convert the set to an ArrayList for sorting and easy access
	        List<Integer> sortedList = new ArrayList<>(distinctElements);
	        
	        // Sort the list in ascending order
	        Collections.sort(sortedList); // Or use .stream().sorted(Collections.reverseOrder())...

	        // If there are less than two distinct elements, there is no second largest
	        if (sortedList.size() < 2) {
	            return -1;
	        }

	        // The second largest element will be at the second-to-last position
	        return sortedList.get(sortedList.size() - 2);
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1, 35};
	        int secondLargest = findSecondLargestUsingMap(arr);
	        if (secondLargest != -1) {
	            System.out.println("The second largest element is: " + secondLargest); // Output: 34
	        } else {
	            System.out.println("No distinct second largest element.");
	        }
	    }
	}


