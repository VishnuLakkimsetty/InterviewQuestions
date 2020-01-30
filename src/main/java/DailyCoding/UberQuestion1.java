/*
 * Given an array of integers, return a new array such that each element at index i of the new array is
 * the product of all the numbers in the original array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
 * If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 */

package main.java.DailyCoding;

public class UberQuestion1 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		modifyArray(arr);
		System.out.println("\n");
		modifyArrayWithoutDivision(arr);
	}

	/**
	 * Use two temp arrays to calculate the product
	 * 1st array holds the left side product
	 * 2nd array holds the right side product
	 * @param arr
	 */
	private static void modifyArrayWithoutDivision(int[] arr) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] modify = new int[arr.length];
		
		// Initialize left and right with 1
		for(int i=0;i<arr.length;i++) {
			left[i] = 1;
			right[i] = 1;
		}
		
		// Calculate left side product
		for(int i=1; i< arr.length;i++) {
			left[i] = arr[i-1] * left[i-1];
		}
		
		// Calculate right side product
		for(int i=arr.length-2; i>= 0;i--) {
			right[i] = arr[i+1] * right[i+1];
		}
		
		// Now calculate the product of elements at same index in both arrays
		// This is our required answer
		for(int i=0;i<arr.length;i++) {
			modify[i]=left[i]*right[i];
		}
		
		for(int i : modify)
			System.out.print(i + " ");		
		
	}

	private static void modifyArray(int[] arr) {
		int product = 1;
		for(int i: arr)
			product*=i;
		int[] modify = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			modify[i]=product/arr[i];
		}
		
		for(int i : modify)
			System.out.print(i + " ");		
	}
}