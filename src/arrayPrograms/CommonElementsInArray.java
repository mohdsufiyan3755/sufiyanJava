package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
	
	public static void main(String[] args) {
        Integer[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        Integer[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        Set<Integer> set = new HashSet<>();
        // Add all elements of the first array to a Set
        for (int num : array1) {
            set.add(num);
        }

        System.out.print("Common elements: ");
        // Iterate second array and check if elements exist in the Set
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                // Remove to avoid printing duplicates if array2 has the same common element multiple times
                set.remove(num); 
            }
        }
    }

}
