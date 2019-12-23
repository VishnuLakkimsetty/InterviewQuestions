// https://algodaily.com/challenges/lonely-number

/*
 * Solution Approach
 * ******************
 * 
 * Use XOR to loop around the array and return the last element
 * 
 * Time Complexity: O(N) where N is size of array
 * Space Complexity: O(1) we are creating map which ultimately has only one element
 */

package main.java.AlgoDaily;

public class LonelyNumberXOR {
	public static void main(String[] args) {
		int[] ar = {4, 4, 6, 1, 3, 1, 3};
		int lonelyNum = ar[0];
		for(int i=1;i<ar.length;i++) {
			lonelyNum^=ar[i];
		}
		System.out.print(lonelyNum);
	}
}
