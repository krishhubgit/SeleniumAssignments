package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int i, j = 0, k;
		int n = 121;
		k = n;
		while(n>0) {
			i=n%10;
			j=(j*10)+i;
			n=n/10;
		}
		if(k==j)
			System.out.println("No is Palindrome");
		else
			System.out.println("No is not a Palindrome");
		
	}

}
