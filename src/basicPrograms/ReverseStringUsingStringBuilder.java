package basicPrograms;

public class ReverseStringUsingStringBuilder {
	public static void main(String[] args) {
        // 1. Define the original string
        String originalString = "Hello, World!";
        
        // 2. Create a StringBuilder object with the original string
        StringBuilder stringBuilder = new StringBuilder(originalString);
        
        // 3. Use the reverse() method to reverse the characters in-place
        stringBuilder.reverse();
        
        // 4. Convert the reversed StringBuilder object back to a String
        String reversedString = stringBuilder.toString();
        
        // 5. Print the results
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

}
