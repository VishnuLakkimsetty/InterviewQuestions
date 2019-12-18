// https://www.hackerrank.com/challenges/alternating-characters/problem

// For better explanation of the problem, 
// Refer this article - https://medium.com/@mannycodes/how-to-solve-the-alternating-characters-code-challenge-160b37ef2ee9

/*
 * Solution Approach:
 * ******************
 * Store the first character in a temporary variable and now loop from the second character of the char array. 
 * If the character is same as the character in temporary variable, increment the counter which says delete 
 * the element else override the temporary variable with this character. 
 * 
 * Time Complexity: O(N) where N is the length of the String
 * Space Complexity: O(1)
 * 
 */
package main.java.HackerRank;

public class AlternatingCharacters {

	public static void main(String[] args) {
		String s = "A";
		System.out.println(deleteCount(s));
	}

	private static int deleteCount(String s) {
		int count = 0;
		if (s.length() != 0 && (s.length() >= 1 && s.length() <= 100000)) {
			char ch = s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				if (ch == s.charAt(i))
					count++;
				else
					ch = s.charAt(i);
			}
		}

		return count;
	}

}
