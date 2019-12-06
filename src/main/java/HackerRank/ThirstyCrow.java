// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-thirsty-crow/description/

package main.java.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class ThirstyCrow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();

		for (int i = 0; i < T; i++) {
			int l, b, h, w;
			l = s.nextInt();
			b = s.nextInt();
			h = s.nextInt();
			w = s.nextInt();

			int N = s.nextInt();
			int[] wi = new int[N];

			for (int j = 0; j < N; j++) {
				wi[j] = s.nextInt();
			}

			int h1 = h - w;
			int count = 0;
			Arrays.sort(wi);

			for (int j = N - 1; j >= 0; j--) {
				if (h1 >= 0) {
					count++;
					h1=h1-wi[j];
				}
			}
			System.out.println(count);
		}
		
		s.close();
	}
}
