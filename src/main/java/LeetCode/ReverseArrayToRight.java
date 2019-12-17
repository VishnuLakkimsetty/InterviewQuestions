// https://leetcode.com/problems/rotate-array/

/*
 * Time Complexity: O(n) n is number of elements in Array
 * Space Complexity: O(1) as no extra is being used
 */

package main.java.LeetCode;

public class ReverseArrayToRight {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		reverseArray(arr, k);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void reverseArray(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length-1; j > 0; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}

	}
}
