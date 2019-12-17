// https://www.codechef.com/DEC19B/problems/WATSCORE

package main.java.CodeChef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {

			int N = sc.nextInt();
			Map<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < N; i++) {
				//String[] s = sc.nextLine().split(" ");
				int s0 = sc.nextInt();
				int s1 = sc.nextInt();
				System.out.println(s0+" "+s1);
				if (map.containsKey(s0)) {
					if (map.get(s0) < s1) {
						map.put(s0,s1);
					}
				} else if(s0<=8)
					map.put(s0,s1);
			}
			System.out.println(map);
			int sum = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				sum += entry.getValue();
			}

			System.out.println(sum);
		}
	sc.close();	
	}

}
