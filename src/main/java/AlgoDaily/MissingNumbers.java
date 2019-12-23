// https://algodaily.com/challenges/find-missing-number-in-array

/*
 * Solution Approach
 * ******************
 * Time Complexity: O(K) where K = ar[last]-ar[first]
 * Space Complexity: O(K)
 */

package main.java.AlgoDaily;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
	public static void main(String[] args) {
		int[] ar = { 3, 7, 9, 19 };
		findMissingNumbers(ar);
	}

	private static void findMissingNumbers(int[] ar) {
		List<Integer> al = new ArrayList<>();
		for (int i = ar[0], j = 0; i < ar[ar.length - 1]; i++) {
			if (ar[j] == i)
				j++;
			else {
				al.add(i);
			}
		}

		for(int i : al) {
			System.out.print(i + " ");
		}
	}
}
