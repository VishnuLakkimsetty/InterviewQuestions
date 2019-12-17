// https://leetcode.com/problems/reverse-integer/

/*
 * Time Complexity: O(log_10(x)) where x is number of digits in number
 * Space Complexity: O(1).
 */

package main.java.LeetCode;

public class ReverseInteger {
	
	public static void main(String[] args) {
		int i=1534236469;
		System.out.println(reverse(i));
	}
	
	public static int reverse(int num) {
		long newNum = 0;
		
		if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE) {
			return 0;
		}
		
		while(num!=0) {
			newNum = (newNum * 10) + (num%10);
			num=num/10;
		}
		
		if(newNum>Integer.MAX_VALUE || newNum<Integer.MIN_VALUE) {
			return 0;
		}
		
		
		return (int)newNum;
	}

}
