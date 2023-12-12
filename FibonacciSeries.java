package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {

	int n = 8, a = 0, b = 1, c;
	//System.out.println(a+ " "+b);
for (int i = 2; i<n; i++) {
	c = a+b;
	System.out.println(" "+c);
	a=b;
	b=c;
	
	
}	
}
}
