import java.util.Scanner;

//Java Program to make a calculator using switch case

public class CalculatorUsingSwitch {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st Number:- ");
	float a = sc.nextFloat();
	System.out.println("Enter 2nd Number:- ");
	float b = sc.nextFloat();
	System.out.println("Enter +,-, /,*,% operation:- ");
	String op = sc.next();
	
	switch(op)
	{
	case "+":
		System.out.println("Addition is = "+(a+b));
		break;
	case "-":
		System.out.println("Substraction is = "+(a-b));
		break;
	case "*":
		System.out.println("Multiplication is = "+(a*b));
		break;
	case "/":
		System.out.println("Division is = "+(a/b));
		break;
	case "%":
		System.out.println("Mode is = "+(a%b));
		break;
	default:
		System.out.println("Please enter right operatio.");
	
	}
}
}
