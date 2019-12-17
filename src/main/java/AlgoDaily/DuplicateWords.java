// https://algodaily.com/challenges/find-duplicate-words/javascript

/*
 * Solution Approach
 * *****************
 * Store the words in the sentence in a map and keep the track of count
 * 
 * Return the key with value more than 1
 * 
 * Time Complexity: The time complexity of the above program is O(K) 
 * where K is the number of words present in the given sentence
 * 
 * Space Complexity: As we are storing the word and its count in a HashMap, 
 * it is clearly seen that we are taking O(K) where is the number of words in the given sentence
 */

package main.java.AlgoDaily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		String sentence = "big black bug bit a big black dog on his big black nose";
		String[] duplicates = checkDuplicates(sentence.toLowerCase().split(" "));

		for (String s : duplicates) {
			System.out.print(s + " ");
		}
	}

	private static String[] checkDuplicates(String[] words) {
		Map<String, Integer> m = new HashMap<>();
		List<String> al = new ArrayList<>();
		for (String s : words) {
			if (m.containsKey(s)) {
				int v = m.get(s);
				m.put(s, ++v);
			} else {
				m.put(s, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			if (entry.getValue() > 1) {
				al.add(entry.getKey());
			}
		}

		String[] dup = new String[al.size()];
		for(int i=0;i<al.size();i++) {
			dup[i] = al.get(i);
		}
		return dup;
	}

}
