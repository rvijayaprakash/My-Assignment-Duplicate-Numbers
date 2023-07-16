package week1.day2;

public class DuplicatedNumbers {

	public static void main(String[] args) {
		int[] nums = {2,5,7,7,5,9,2,3};
		
		for (int loop=0; loop<nums.length; loop++) {
			for (int nestloop=loop+1; nestloop<(nums.length); nestloop++) {
				if (nums[loop]==nums[nestloop]) {
					System.out.println("Duplicated Numbers are: "+nums[loop]);
				}
			}
		}

	}

}
