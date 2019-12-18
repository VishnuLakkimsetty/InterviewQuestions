// https://algodaily.com/challenges/dollar-sign-deletion/javascript

/*
 * Solution Approach
 * ******************
 * This involves 2 steps 
 * 
 * Step 1: 
 * **********
 * Convert all the strings in the given string array by removing $ symbol as explained in the problem statement
 * 
 * This has 2 sub steps:
 * Step (a):
 * *********
 * Use stack to delete the $ symbol and the preceding character in the string
 * 
 * Step (b):
 * *********
 * Once the step (a) is done form the string with the remaining characters in the stack
 * 
 * 
 * Step 2:
 * *******
 * Now loop over the converted String array and check whether all the strings are equal or not
 * 
 * 
 * Time Complexity: As we are looping around the array of strings it takes O(N) time 
 * and for each string to do the $ delete operation and to create a new string with 
 * remaining characters it takes O(M*M/2) time per string where M is the length of the 
 * longest string in the given string array. So the total time complexity of the program is O(N*M²).
 * 
 * 
 * Space Complexity: As we are using the stack for the delete operation and char array 
 * to create a modified string, it takes O(M+M) space where M is the length of the longest 
 * string in the given string array. So the total space complexity of the program is O(M).
 * 
 */

package main.java.AlgoDaily;

import java.util.Stack;

public class DeleteDollar {

	public static void main(String[] args) {
		String[] str = { "f$ec", "ec$" };
		System.out.println(isDollarDeleteEqual(str));
	}

	private static boolean isDollarDeleteEqual(String[] str) {
		for (int i = 0; i < str.length; i++) {
			str[i] = removeDollar(str[i]);
		}

		for (int i = 1; i < str.length; i++) {
			if (str[i].equalsIgnoreCase(str[i - 1]))
				continue;
			else
				return false;
		}
		return true;

	}

	private static String removeDollar(String str) {
		Stack<Character> s = new Stack<>();
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '$' && !s.isEmpty()) {
				s.pop();
			} else {
				s.push(str.charAt(i));
			}
		}

		while (!s.isEmpty()) {
			s1 = s1 + s.pop();
		}
		s1 = reverse(s1);
		return s1;
	}

	static String reverse(String s) {
		int l = s.length();
		char[] ch = s.toCharArray();
		for (int i = 0; i < l / 2; i++) {
			char t = ch[i];
			ch[i] = ch[l - i - 1];
			ch[l - i - 1] = t;
		}
		return new String(ch);
	}

}
