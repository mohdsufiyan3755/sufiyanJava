package arrayPrograms;

public class CustomArrayEquality {
	
	public static boolean checkEquality(int[] arr1, int[] arr2) {
        // First, check if the lengths are the same
        if (arr1.length != arr2.length) {
            return false;
        }

        // If lengths match, iterate through elements and compare
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Mismatch found
            }
        }

        // If the loop completes without finding any mismatches, they are equal
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};

        System.out.println("Are array1 and array2 equal? " + checkEquality(array1, array2)); // Output: true
        System.out.println("Are array1 and array3 equal? " + checkEquality(array1, array3)); // Output: false
    }

}
