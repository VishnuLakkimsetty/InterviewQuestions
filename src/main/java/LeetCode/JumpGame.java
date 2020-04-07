// https://leetcode.com/contest/biweekly-contest-19/problems/jump-game-iv/

package main.java.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class JumpGame {

	public static void main(String[] args) {
		int[] arr = { 68, -94, -44, -18, -1, 18, -87, 29, -6, -87, -27, 37, -57, 7, 18, 68, -59, 29, 7, 53, -27, -59,
				18, -1, 18, -18, -59, -1, -18, -84, -20, 7, 7, -87, -18, -84, -20, -27 };
		System.out.println(minJumps(arr));
	}

	public static int minJumps(int[] arr) {
		Map<Integer, ArrayList<Integer>> map1 = new HashMap<>();

		int n = arr.length;
		if (n == 1)
			return 0;

		for (int i = 0; i < n; i++) {
			if (!map1.containsKey(arr[i])) {
				map1.put(arr[i], new ArrayList<>(Arrays.asList(i)));
			} else {
				ArrayList<Integer> value = map1.get(arr[i]);
				value.add(i);
				map1.put(arr[i], value);
			}
		}

		for (Map.Entry<Integer, ArrayList<Integer>> entry : map1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Map<Integer, Integer> map2 = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		map2.put(0, 0);
		q.add(0);

		while (!q.isEmpty()) {
			int n1 = q.poll();
			int nextIndex = n1 + 1;
			int prevIndex = n1 - 1;
			ArrayList<Integer> maxIndices = map1.get(arr[n1]);
			if (n1 == n - 1) {
				return map2.get(n1);
			}

			if (nextIndex < n) {
				if (!map2.containsKey(nextIndex)) {
					q.add(nextIndex);
					int value = map2.get(n1);
					map2.put(nextIndex, ++value);
				}
			}

			if (prevIndex >= 0) {
				if (!map2.containsKey(prevIndex)) {
					q.add(prevIndex);
					int value = map2.get(n1);
					map2.put(prevIndex, ++value);
				}
			}

			for (int i : maxIndices) {
				if (!map2.containsKey(i)) {
					q.add(i);
					int value = map2.get(n1);
					map2.put(i, ++value);
				}
			}

		}

		return -1;
	}

}
