package main.java.Turvo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GroupingTransactions {
	public static void main(String[] args) {
		int[] t = {3,3,2,1,1};
		groupTransactions(t);
	}

	private static void groupTransactions(int[] t) {
		Map<Integer, Integer> m = new LinkedHashMap<>();
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(t);
		
		for(int i : t) {
			if(!m.containsKey(i)) {
				m.put(i, 1);
			} else {
				int value = m.get(i);
				m.put(i, ++value);
			}
		}
		
		// Sort map by values using List
		
		List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(m.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		// Add elements to 2D array
		for(Entry<Integer, Integer> entry : list) {
			al.add(new ArrayList<>(Arrays.asList(entry.getKey(),entry.getValue())));
		}
		
		for(int j=0; j<al.size();j++) {
			for(int k = 0; k<al.get(j).size();k++) {
				System.out.print(al.get(j).get(k));
			}
			System.out.println();
		}
		
	}
}
