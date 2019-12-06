// Write a method that moves all zeros in an array to its end. Also, note that you should maintain the order of all other elements. 
// Oh, and this needs to be done in O(n) time

/*
 * Solution Approach:
 * ********************
 * Create index counter for the array to hold the position where non-zero element to be moved
 * 
 * Now loop around main array, if non-zero, push the element to temp index of a and increment temp index
 * if zero, leave it and later push zeros to remaining length of array and return it
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

package main.java.AlgoDaily;

public class AllZerosToRight {
	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 2, 0, 5, -9 };
		moveZeros(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] moveZeros(int[] a) {
		int temp_index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[temp_index] = a[i];
				temp_index++;
			}
		}

		for (int i = temp_index; i < a.length; i++) {
			a[i] = 0;
		}

		return a;
	}

}
