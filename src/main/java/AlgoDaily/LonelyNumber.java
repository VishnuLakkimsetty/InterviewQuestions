// https://algodaily.com/challenges/lonely-number

/*
 * Solution Approach
 * ******************
 * Time Complexity: O(N) where N is size of array
 * Space Complexity: O(1) we are creating map which ultimately has only one element
 */

package main.java.AlgoDaily;

import java.util.HashMap;
import java.util.Map;

public class LonelyNumber {
	public static void main(String[] args) {
		int[] ar = {4, 4, 6, 1, 3, 1, 3};
		Map<Integer,Integer> m = new HashMap<>();
		for(int i=0;i<ar.length;i++) {
			if(m.containsKey(ar[i])) {
				m.remove(ar[i]);
			} else {
				m.put(ar[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
