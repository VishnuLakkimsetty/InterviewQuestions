// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

/*
 * Use two pointer approach
 * *************************
 * 
 * First pointer at the start of string and the second at the end of string
 * 
 * if you encounter with the vowel then interchange the vowel
 * 
 * Space O(1)
 * Time O(N)
 */

package main.java.LeetCode;

public class ReverseVowels {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseVowel(s));
	}

	private static String reverseVowel(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0, j = ch.length - 1; i <= j;) {
			if (!isVowel(ch[i])) {
				i++;
			}

			if (!isVowel(ch[j])) {
				j--;
			}

			if (isVowel(ch[i]) && isVowel(ch[j])) {
				char temp = ch[j];
				ch[j] = ch[i];
				ch[i] = temp;
				i++;
				j--;
			}
		}
		return new String(ch);
	}

	private static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U');
	}
}
