package basicPrograms;

public class FindDuplicates {

	public static void main(String[] args) {
		
		String sentence = "find the duplicates in the string";
		String characters = "";
		String duplicates = "";
		for (int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if (characters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates = duplicates + current;
				}
			}
			characters = characters + current;			
		}
		
		System.out.println(duplicates);
		//System.out.println(characters);
	}

}
