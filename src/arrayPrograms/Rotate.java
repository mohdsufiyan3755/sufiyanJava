package arrayPrograms;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5,6,7};
		int k=2;
		for (int i=0; i<k; i++) {
			int first = num[0];
			for (int j=0; j<num.length-1; j++) {
				num[j] = num[j+1];
			}
			num[num.length-1]=first;
		}
		System.out.println(Arrays.toString(num));

	}

}
