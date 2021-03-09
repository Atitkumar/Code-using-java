//Java Program to find Largest of three numbers

public class LargetsOf3Num {
	public static void main(String[] args) {
		int a = 77;
		int b = 45;
		int c = 79;
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}else
		{
			System.out.println("C is greater");
		}
	}
}
