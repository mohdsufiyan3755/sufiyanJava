package basicPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArrayList {
	public static void main(String[] args) {
        ArrayList<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Java");
        listWithDuplicates.add("Python");
        listWithDuplicates.add("Java");
        listWithDuplicates.add("C++");
        listWithDuplicates.add("Python");

        System.out.println("Original ArrayList: " + listWithDuplicates);

        // Convert to LinkedHashSet to remove duplicates and maintain order
        Set<String> setWithoutDuplicates = new LinkedHashSet<>(listWithDuplicates);

        // Clear the original ArrayList
        listWithDuplicates.clear();

        // Add all unique elements back to the ArrayList
        listWithDuplicates.addAll(setWithoutDuplicates);

        System.out.println("ArrayList without duplicates: " + listWithDuplicates);
    }

}
