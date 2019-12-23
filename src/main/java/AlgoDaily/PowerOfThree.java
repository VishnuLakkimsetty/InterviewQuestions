// https://algodaily.com/challenges/power-of-three

/*
 * Solution Approach
 * ******************
 * If the given number is not divisible by 3 return false
 * If the given number is divisible by 3, then divide the number 3 until the number reaches un divisible by 3
 * 
 * Now if the resultant num is equal to 1 then it is a power of 3 so return true else return false
 * 
 * if num = 9; 9/3 = 3; 3/3 = 1 return true
 * if num = 27; 27/3 = 9; 9/3 = 3; 3/3 = 1 return true
 * if num = 18; 18/3=6; 6/3 = 2; return false
 * if num = 14; return false
 * 
 * Time Complexity: O(
 * Space Complexity: O(1)
 * 
 */

package main.java.AlgoDaily;

public class PowerOfThree {
	public static void main(String[] args) {
		int n = 89;
		System.out.println(IsThreePower(n));
	}

	private static boolean IsThreePower(int n) {
		while (n % 3 == 0) {
			n /= 3;
		}
		if (n == 1)
			return true;
		else
			return false;
	}
}
