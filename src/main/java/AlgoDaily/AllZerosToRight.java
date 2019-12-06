// Write a method that moves all zeros in an array to its end. Also, note that you should maintain the order of all other elements. 
// Oh, and this needs to be done in O(n) time

/*
 * Solution Approach:
 * 
 * Create a temp[] of size of given array and a index counter for temp array
 * 
 * Now loop around main array, if non-zero, push to temp and increment index of temp array
 * if zero, increment counter and later push remaining number of zeros to temp array and return it
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

package main.java.AlgoDaily;

public class AllZerosToRight {
	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 2, 0, 5, -9 };
		a = moveZeros(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] moveZeros(int[] a) {
		int[] temp = new int[a.length];
		int temp_index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				temp[temp_index] = a[i];
				temp_index++;
			}
		}

		for (int i = temp_index; i < temp.length; i++) {
			temp[i] = 0;
		}

		return temp;
	}

}
