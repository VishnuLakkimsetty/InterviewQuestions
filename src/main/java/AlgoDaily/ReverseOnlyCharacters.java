// https://algodaily.com/challenges/reverse-only-alphabetical/javascript

/*
 * Solution Approach
 * ******************
 * Convert the string to char array and loop till half of the array
 * 
 * Use two pointer approach to solve this problem and interchange the elements only if they are characters
 * 
 * 1st pointer starts from start of array and 2nd pointer starts from end of the array
 */

package main.java.AlgoDaily;

public class ReverseOnlyCharacters {
	
	public static void main(String[] args) {
//		String str = "A!B3CDFR$";
//		System.out.println(reverseString(str));
		String str1 = "sea!$hells3";
		System.out.println(reverseString(str1));
	}

	private static String reverseString(String str) {
		char[] ch = str.toCharArray();
		for(int i=0,j=ch.length-1; i<ch.length/2 && i!=j;) {
			if(('A'<=ch[i] && ch[i]<='Z') || ('a'<=ch[i] && ch[i]<='z')) {
				if(('A'<=ch[j] && ch[j]<='Z') || ('a'<=ch[j] && ch[j]<='z')) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					j--;
					i++;
				} else {
					j--;
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					j--;
					i++;
				}
			} else {
				i++;
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				j--;
				i++;
			}
		}
		
		return new String(ch);
	}
}
