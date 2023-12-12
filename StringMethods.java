package week4.day2;

public class StringMethods {

	public static void main(String[] args) {
		String input = "Testleaf";		
		char[] ch = input.toCharArray();		
		for (int i = ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
			
		}
		
	}

}
