package patternPrograms;

public class patternProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//pattern1();
		//pattern2();
		//pattern3();
		//pattern4();
		//pattern5();
		pattern6();
		//pattern7();
		//pattern8();
		//pattern9();
	
	}
		
	private static void pattern1() {
	for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}

	private static void pattern2() {
		for (int i=1; i<=6; i++) {
			for (int j=6; j>=i; j--) {
			System.out.print(" ");
			}
		for (int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	}
	
	private static void pattern3() {
		for (int i=1; i<=6; i++) {
			for (int j=6; j>=i; j--) {
			System.out.print(" ");
			}
		for (int k=1; k<=i; k++) {
			System.out.print("*");
		}
		for(int l=2; l<=i; l++) {
			System.out.print("*");
		}
		System.out.println();
	}
		

	}
	
	private static void pattern4() {
		for (int i=1; i<=6; i++) {
			for (int j=6; j>=i; j--) {
			System.out.print(" ");
			}
		for (int k=1; k<=i; k++) {
			System.out.print("*");
		}
		for(int l=2; l<=i; l++) {
			System.out.print("*");
		}
		System.out.println();
	}
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
		}
			for (int k=6; k>=i; k--) {
				System.out.print("*");
			}
			
			 for(int l=5; l>=i; l--) { 
				 System.out.print("*");
			 }
			System.out.println();
			}
			
			
	}
	
	private static void pattern5() {
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=6; i++) {
			for(int j=6; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void pattern6() {
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int k=6; k>=i; k--) {
				System.out.print("*");
			}
			for (int l=5; l>=i; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=6; i++) {
			for (int j=6; j>=i; j--) {
			System.out.print(" ");
			}
		for (int k=1; k<=i; k++) {
			System.out.print("*");
		}
		for(int l=2; l<=i; l++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
		
	}
		private static void pattern7() {
			for (int i=1; i<=6; i++) {
					for (int j=1; j<=i; j++) {
						if (i==j) {
						System.out.print("*");
						}
						else {
						System.out.print(" ");
				}
					}
					System.out.println();
						
			}
		}
		
		private static void pattern8() {
					for (int i=6; i>=1; i--) {
						for (int j=1; j<=i-1; j++ ) {
							System.out.print(" ");
						}
						System.out.print("*");
					System.out.println();
					}
					
				}
				
			
		private static void pattern9() {
			for (int i=1; i<=6; i++) {
				for (int j=6; j>=i-1; j-- ) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					if(k==i) {
				System.out.print("*");
					}
				}
			System.out.println();
			}
			
		}
	
}
