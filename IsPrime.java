package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		int number = 5;
		int count = 0;
		for (int i = 1; i<=number; i++) {
			if(number%i == 0){
			count++;
		}
			}
		if(count==2){
		System.out.println(+number+ "No is a Prime Number");
	}
		else{
		System.out.println(+number+ "No is not a prime Number");
			
		}
		}
	}


