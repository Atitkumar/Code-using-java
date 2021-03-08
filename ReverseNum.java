//Java Program to reverse a number

public class ReverseNum {
	public static void main(String[] args) {
		int num = 75765;
		int rem;
		int rev = 0, qu;
		while(num!=0)
		{
			rem = num%10;
			rev = rem+10*rev;
			num = num/10;
		}
		System.out.println("Reversed Number: " + rev);
	}
}


