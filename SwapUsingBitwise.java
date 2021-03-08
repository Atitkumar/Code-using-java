//Java Program to swap two numbers using bitwise operator

public class SwapUsingBitwise {
	public static void main(String[] args) {
		int a = 9;
		int b = 13;
		
		System.out.println("Before Swaping a = "+a+" b = "+b);
		
		a = a^b;
		b = a^b;
		a = b^a;
		
		System.out.println("After Swaping  a = "+a+" b= "+b);
	}
}
