// https://algodaily.com/challenges/majority-element

/*
 * Solution Approach
 * ******************
 * Store the count of array elements in a map and 
 */

package main.java.AlgoDaily;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {
	public static void main(String[] args) {
		int[] a = {4,2,2,4};
		System.out.println(majority(a));
	}

	private static int majority(int[] a) {
		Map<Integer,Integer> m = new HashMap<>();
		int majority = Integer.MIN_VALUE;
		for(int i : a) {
			if(m.containsKey(i)) {
				int value = m.get(i);
				m.put(i, ++value);
			} else {
				m.put(i, 1);
			}
		}
		int value = (int) Math.floor(a.length/2);
		for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
			if(value<=entry.getValue())
				majority = entry.getKey();
		}
		
		
		return majority;
//		return Collections
	}
}
