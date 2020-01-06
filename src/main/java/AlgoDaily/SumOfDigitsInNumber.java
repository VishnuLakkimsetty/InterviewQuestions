// https://algodaily.com/challenges/sum-digits-until-one/javascript

/*
 * Solution Approach:
 * ******************
 * Add the digits in the given number and store it as a sum
 * 
 * Repeat step 1 until the number in the sum is a single digit
 * 
 * Algorithm used is recursion
 * 
 * Time Complexity: O(logN) where N is given number
 * Space Complexity: O(1)
 */

package main.java.AlgoDaily;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int num = 123456;
		System.out.println(digitSum(num));
	}

	private static int digitSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		if (sum > 9 || sum < 0) {
			sum = digitSum(sum);
		}
		return sum;
	}

}