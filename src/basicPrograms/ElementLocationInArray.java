package basicPrograms;

public class ElementLocationInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6; int sum=0;
		int [] arr = {1,3,3,4,5,6,6,7,8,9,9};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println(i);
				sum++;
			}
		}
		if(sum==0) {
			System.out.println("Array does not have the element");
		}

	}

}
