// Can you write a function that reverses an inputted string without using the built-in Array#reverse method

package main.java.AlgoDaily;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "vishnus";
		System.out.println(reverse(s));
	}

	static String reverse(String s) {
		int l = s.length();
		char[] ch = s.toCharArray();
		for(int i=0;i<l/2;i++) {
			char t = ch[i];
			ch[i]=ch[l-i-1];
			ch[l-i-1]=t;
		}
		return new String(ch);
	}
	
}
