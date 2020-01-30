package main.java.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
	public boolean isValid(String exp) {

		int l = 0;
		List<Integer> storeOpenBracesIndex = new ArrayList<Integer>();
		for (int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				if (l >= 0) {
					l++;
					storeOpenBracesIndex.add(i);
				} else {
					System.out.println("Printing counter value :: " + l);
					return false;
				}

			} else if (c == ')' || c == '}' || c == ']') {
				if (l >= 0) {
					try {
						if (c == ')') {
							if (exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size() - 1)) == '(')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size() - 1);
							else
								return false;
						} else if (c == '}') {
							if (exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size() - 1)) == '{')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size() - 1);
							else
								return false;
						} else if (c == ']') {
							if (exp.charAt(storeOpenBracesIndex.get(storeOpenBracesIndex.size() - 1)) == '[')
								storeOpenBracesIndex.remove(storeOpenBracesIndex.size() - 1);
							else
								return false;
						}
					} catch (Exception e) {
						return false; // If the first element of the exp is closing brace
					}

					l--;
				} else {
					return false;
				}

			}
		}

		if (l == 0)
			return true;
		else
			return false;

	}
}
