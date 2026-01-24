package basicPrograms;

public class Bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=6, y=5,z,z1,z2,z3,z4,z5,z6;
		//AND operator
		z=x&y;
		//OR operator
		z1=x|y;
		//XOR operator
		z2=x^y;
		//Bitwise complement (-(N+1))
		z3=~x;
		//Signed Right Shift operator- The right shift operator moves all bits by a given number of bits to the right.
		z4=x>>1;
		//Signed Left Shift operator- The left shift operator moves all bits by a given number of bits to the left.
		z5=y<<1;
		//Unsigned right Shift operator- It is the same as the signed right shift, but the vacant leftmost position is filled with 0 instead of the sign bit.
		z6=x>>>1;
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
	}

}
