//https://leetcode.com/problems/two-sum/

/*
 * Use hashmap to store the index and of each element of an array.
 * 
 * Now subtract the first element from required sum. If the diff is present in map then return index of first element 
 * and value of diff in Hashmap
 * 
 * If nothing present throw error or return -1,-1
 * 
 * Time complexity: O(N) where N is size of array
 * Space Complexity: O(N) as we are using Hashmap of size N
 */

package main.java.LeetCode;

import java.util.HashMap;


public class TwoSumProblem {
	
	public static void main(String[] args) {
		int a[] = {1,2,4,7,-11};
		int k = -10;
		int r[] = getIndices(a,k);
		for(int i=0;i<r.length;i++) {
			System.out.println(r[i]+" ");;
		}
	}

	private static int[] getIndices(int[] a, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], i);
		}
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(k-a[i]) && map.get(k-a[i]) != i) {
				return new int[] {i,map.get(k-a[i])};
			}
		}
		
		return new int[] {-1,-1};
	}

}
