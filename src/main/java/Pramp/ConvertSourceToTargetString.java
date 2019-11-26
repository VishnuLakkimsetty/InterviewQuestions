/*
 * Given two strings of uppercase letters source and target, list (in string form) a sequence of edits to 
 * convert from source to target that uses the least edits possible.
 * For example, with strings source = "ABCDEFG", and target = "ABDFFGH" 
 * we might return: ["A", "B", "-C", "D", "-E", "F", "+F", "G", "+H"
 * More formally, for each character C in source, we will either write the token C, which does not count as an edit; 
 * or write the token -C, which counts as an edit. Additionally, between any token that we write, we may 
 * write +D where D is any letter, which counts as an edit. 
 * 
 * At the end, when reading the tokens from left to right, and not including tokens prefixed with a minus-sign,
 * the letters should spell out target (when ignoring plus-signs.)
 * 
 * In the example, the answer of A B -C D -E F +F G +H has total number of edits 4 (the minimum possible), 
 * and ignoring subtraction-tokens, spells out A, B, D, F, +F, G, +H which represents the string target.
 * 
 * If there are multiple answers, use the answer that favors removing from the source first.
 * 
 * Constraints:
 * [time limit] 5000ms
 * 
 * [input] string source
 * 2 <= source.length <= 12
 * 
 * [input] string target
 * 2 <= target.length <= 12
 * 
 * [output] array.string
 * 
 * ******************
 * Solution Approach
 * ******************
 * 
 * First create a stack of char type and then push the source string characters from right to left i.e, in reverse direction such that
 * top element is the first character of the source string
 * 
 * Now we need to compare each character of second string with the elements in stack
 * 
 * 	- If the current character of target element and the top element of stack is same then print the character and pop the top element
 * 	- If the current character of target element and top element of stack are not same, then we need to the following
 * 		- compare current character of target element and the element next to top element:
 * 				- If they are equal, just print the top element of stack by appending '-' as prefix and pop the top element
 * 				- Also print the next top element of stack as it is and pop the element out
 * 				
 * 				- If they are not equal, print the top element of stack by appending '-' as prefix and pop the top element
 * 				- Also print the current character of target element by appending '+' as prefix
 * 
 * 				- If the next element is null, then compare the top element of stack with next character in target string
 * 						- If they are equal, then print the current character of target element by appending '+' as prefix and print
 * 						  the top element of stack as it is
 * 						- If not equal, then print the top element of stack by appending '-' as prefix and pop the top element and also
 * 						  print current character of target element by appending '+' as prefix 
 * 	- If iteration over target string is done and stack is not empty then print remaining elements of stack by prefixing '-'
 *  - If stack is empty before the iteration over target string is completed, then print remaining elements of target string
 *    by prefixing '+'
 */

package main.java.Pramp;

import java.util.Stack;

public class ConvertSourceToTargetString {

	public static void main(String args[]) {
		convertString("ABCDEFG", "ABDDFGH");
	}

	public static void convertString(String source, String target) {
		Stack<Character> s = new Stack<>();

		for (int i = source.length() - 1; i >= 0; i--) {
			s.push(source.charAt(i));
		}

		for (int i = 0; i < target.length(); i++) {
			if (!s.isEmpty()) {
				// current character of target element and the top element of stack is same
				if ((target.charAt(i) == s.peek())) {
//					System.out.println("top element "+s.peek());
//					System.out.println("first target element "+target.charAt(i));
					System.out.print(target.charAt(i)+" ");
					s.pop();
					continue;
				}
				// current character of target element and top element of stack are not same
				else if((target.charAt(i) != s.peek())) {
					// compare current character of target element and the element next to top
					// element
//					System.out.println("top element "+s.peek());
//					System.out.println("first target element "+target.charAt(i));
					char top = s.pop();
					try {
						if (s.peek() != null) {
//							System.out.println("top next element "+s.peek());
							// If they are equal, just print the top element of stack by appending '-' as
							// prefix and pop the element from stack. Also print the next top element of
							// stack as it is and pop the element out
							if (target.charAt(i) == s.peek()) {
								System.out.print("-" + top + " ");
								System.out.print(s.pop() + " ");
								continue;
							}
							// If they are not equal, print the top element of stack by appending '-' as
							// prefix and pop the top element. Also print the current character of target
							// element by appending '+' as prefix
							else {
								System.out.print("-" + top + " ");
								System.out.print("+" + target.charAt(i) + " ");
								continue;
							}
						}	
					}
					// If the next element of stack is null, then compare the top element of stack
					// with next character in target string
					catch (Exception e) {
						// If they are equal, then print the current character of target element by
						// appending '+' as prefix
						if (target.charAt(i + 1) == top) {
//							System.out.println("target next element "+target.charAt(i + 1));
							System.out.print("+" + target.charAt(i) + " ");
							continue;
						}
						// If not equal, then print the top element of stack by appending '-' as prefix
						// and pop the top element and also
						// print current character of target element by appending '+' as prefix
						else {
							System.out.print("-" + top + " ");
							System.out.print("+" + target.charAt(i) + " ");
							continue;
						}
					}

				}

			} else {
				// stack is empty i.e., length of target string greater than that of source
				// string
				System.out.print("+" + target.charAt(i) + " ");
			}
		}

		// stack is not empty i.e., length of target string less than that of source
		// string
		if (!s.isEmpty()) {
			System.out.print("-" + s.pop() + " ");
		}

	}

}
