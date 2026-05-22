package arrayPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int [] num = {10,20,9,45,5,32,78};
		int max = 0;
		int secondMax = 0;
		for (int numLarge:num) {
			if (numLarge>max) {
				secondMax = max;
				max = numLarge;				
				
			}
			else if (numLarge>max && numLarge!=max) {
				secondMax = numLarge;
			}
		}
		System.out.println("second max: "+secondMax);

	}

}
