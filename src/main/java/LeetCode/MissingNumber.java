// https://leetcode.com/problems/missing-number/

/*
 * Solution Approach
 * ******************
 * Sort the given array and loop around the array
 * if the element at the index is equal to index then continue, if not return the index
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * 
 */

package main.java.LeetCode;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.println(missingNumber(arr));
	}

	private static int missingNumber(int[] arr) {
		Arrays.sort(arr);
		int i = 0;
		for (; i < arr.length; i++) {
			if (i != arr[i])
				return i;
		}
		return i;
	}

}
