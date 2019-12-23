// https://www.hackerrank.com/challenges/drawing-book/problem

/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package main.java.HackerRank;

public class DrawingBook {

	public static void main(String[] args) {
		int n = 6;
		int p =5;
		System.out.println(numberOfFlips(n,p));
	}

	private static int numberOfFlips(int n, int p) {
		n = n%2 == 1 ? n : ++n; // Considering odd page
        int i = p/2; // Number of flips from left and assuming page 0 is on left
        int j = (n-p)/2; // Number of flips from right
        return i>j ? j:i; // Return minimum
	}
}
