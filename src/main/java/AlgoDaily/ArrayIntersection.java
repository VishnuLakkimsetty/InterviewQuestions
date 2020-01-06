// https://algodaily.com/challenges/array-intersection

/*
 * Solution Approach
 * ******************
 * 
 * Store the unique elements of 1st array in a Map with count as one
 * 
 * Now store the unique elements of 2nd array in the same with coun 
 * 
 * Return the keys whose values are greater than one
 * 
 */

package main.java.AlgoDaily;

import java.util.HashMap;
import java.util.Map;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] arr1 = {4,17,4,4,15,16,17,6,7};
		int[] arr2 = {15,2,6,20,17,17,8,4,5};
		findCommon(arr1, arr2);
	}

	private static void findCommon(int[] arr1, int[] arr2) {
		Map<Integer, Integer> m = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(m.containsKey(arr1[i])) {
				continue;
			} else {
				m.put(arr1[i], 1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(m.containsKey(arr2[i])) {
				int v = m.get(arr2[i]);
				m.put(arr2[i], ++v);
			} else {
				m.put(arr2[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
