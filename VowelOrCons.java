//Java Program to check whether input character is vowel or consonant

public class VowelOrCons {
	public static void main(String[] args) {
		char c = 'U';
//		char c = 'z';
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println(c+" is a vowel");
		}else
		{
			System.out.println(c+" is a consonent");
		}

	}
}
