// https://algodaily.com/challenges/find-first-non-repeating-character

/*
 * Solution Approach
 * ******************
 * Store the character count in Linked Hashmap as it stores the elements in the way they are inserted
 * 
 * Once the character count is stored loop around the map and return the key that occurred first with value 1
 * 
 * Time Complexity: O(N) where N is length of string
 * Space Complexity: O(N) where N is length of string
 */

package main.java.AlgoDaily;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String s = "";
		System.out.println(NonRepeatChar(s));
	}

	private static char NonRepeatChar(String s) {
		Map<Character, Integer> m = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(m.containsKey(s.charAt(i))) {
				m.remove(s.charAt(i));
			} else {
				m.put(s.charAt(i), 1);
			}
		}

		for(Map.Entry<Character, Integer> entry : m.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return Character.MIN_VALUE;
	}
}
