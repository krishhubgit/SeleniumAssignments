package week3.day1;

import java.util.Arrays;

public class FindingMissingelementonarray {
	int a = 10;

	public static void main(String[] args) {
		int[] number =  {1, 4,3,2,8, 6, 7}; 
		int length = number.length+1;
		int sum = (length*(length+1))/2;
		
		//Arrays.sort(number);
		//System.out.println(number[0]);

		for (int i = 0; i < number.length; i++) {
			sum = sum -number[i];
			System.out.println(sum);
			
		}
		
		}
	}


