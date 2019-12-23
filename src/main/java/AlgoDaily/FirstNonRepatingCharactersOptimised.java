package main.java.AlgoDaily;

public class FirstNonRepatingCharactersOptimised {
	public static void main(String[] args) {
		String s = "";
		System.out.println(NonRepeatChar(s));
	}

	private static char NonRepeatChar(String s) {
		char[] ch = new char[26];
		for(int i=0;i<s.length();i++) {
			ch[s.charAt(i)-'A']++;
		}
		return Character.MIN_VALUE;
	}
	
}
