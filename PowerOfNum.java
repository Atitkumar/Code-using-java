//Java Program to calculate power of a number

public class PowerOfNum {

	public static void main(String[] args) {
		int num = 2;
		int pow = 4;
		int res = 1;
		while(pow!=0)
		{
			res*=num;
			--pow;
		}
				
		System.out.println("Result is = "+res);

	}

}
