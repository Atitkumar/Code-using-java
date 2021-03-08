// Java Program to find smallest of three numbers using ternary operator

public class SmallestNumUsingTernaryOp {
	public static void main(String[] args) {
		int a = 12, b = 21, c = 15,temp, small;
		
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		
		temp = a<b? a:b;
		small = c<temp?c:temp;
		
		System.out.println("Smallest number is = "+small);
		
	}
}
