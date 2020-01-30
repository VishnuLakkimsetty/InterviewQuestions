/*
 * Consider a String S, that is a series of characters, each followed by a frequency as an integer. 
 * The string is not compressed correctly, so there may be many occurrences of the same character.
 * 
 * A properly compressed String will consist of one instance of each character in alphabetical order followed by 
 * the total count of that character with in the string.
 * 
 * For example:
 * ***********
 * a3c9b2c1 should be compressed to a3b2c10
 * 
 * Constraints:
 * ************
 * 1 <= size of String <= 100000
 * 'a' <= chars in String <= 'z'
 * 1 <= frequency of each char in String <= 1000
 */

package main.java.Qualcomm;

import java.util.Map;
import java.util.TreeMap;

public class BetterCompression {
	public static void main(String[] args) {
		String s = "a12c56a1b5";
		stringCompress(s);
	}

	private static void stringCompress(String s) {
		char[] s1 = s.toCharArray();
	    Map<String,Integer> map  = new TreeMap<>();
	    String found = "";
	    String num = "";
	    String modified = "";
	    for(char c : s1){
	        if(Character.isLetter(c)){
	            if(found != "" && num != ""){
	                if(!map.containsKey(found))
	                     map.put(found, Integer.parseInt(num));
	                else {
	                    int value = map.get(found);
	                    value+=Integer.parseInt(num);
	                    map.put(found,value);
	                }
	            }
	            found = Character.toString(c);
	            num = "";
	        } else if(Character.isDigit(c)){
	            num = num+Character.toString(c); 
	        }
	    }
	    // For last entry
	    if(!map.containsKey(found))
	                     map.put(found, Integer.parseInt(num));
	                else {
	                    int value = map.get(found);
	                    value+=Integer.parseInt(num);
	                    map.put(found,value);
	                }

	    
	    for(Map.Entry<String,Integer> entry : map.entrySet()){
	        modified = modified+entry.getKey()+entry.getValue();
	    }
	    
	    System.out.println(modified);
		
	}

}
