package week3.day1;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] nums =  {3, 2, 11, 4, 6, 7};
		int length = nums.length;
		Arrays.sort(nums);
		System.out.println("SecondLargestNumber" +nums[length-2]);

	}

}
