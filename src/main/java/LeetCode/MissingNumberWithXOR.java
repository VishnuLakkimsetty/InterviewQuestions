// https://leetcode.com/problems/missing-number/

/*
 * Solution Approach
 * ******************
 * Iterate the array 
 * Initialize an integer to n and XOR it with every index and value, we will be left with the missing number.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * 
 */

package main.java.LeetCode;

public class MissingNumberWithXOR {

	public static void main(String[] args) {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(arr));
	}

	private static int missingNumber(int[] arr) {
		int missing = arr.length;
		for(int i=0;i<arr.length;i++) {
			missing^=i^arr[i];
		}
		
		return missing;
	}

}
