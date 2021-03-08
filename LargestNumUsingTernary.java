//Java Program to find largest of three numbers using ternary operator

public class LargestNumUsingTernary {
	public static void main(String[] args) {
		int a = 82, b = 92, c = 15,temp, largest;
		
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		
		temp = a>b? a:b;
		largest = c>temp?c:temp;
		
		System.out.println("Largest number is = "+largest);
		
	}
}
