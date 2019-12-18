// https://algodaily.com/challenges/dollar-sign-deletion/javascript

/*
 * Solution Approach:
 * *******************
 * 
 * Here we use an integer counter and a new string variable to 
 * modify each string and replace it in the given array. 
 * Follow the below rules for this approach.
 * 
 * Rule 1: We loop around the characters in the string in reverse order 
 * and increment this counter whenever we encounter a $ symbol in the string. 
 * 
 * Rule  2: If we encounter an alphabet or number in the string and if the 
 * counter value is greater than 0, we decrement the counter value.
 * 
 * Rule 3: If we encounter an alphabet or number in the string and if the 
 * counter value is less than 0, we append the character to the created new string
 * 
 * Overall time complexity is O(N*M) and space complexity is O(1) with this approach
 * 
 */

package main.java.AlgoDaily;

public class DeleteDollarOptimized {
	static String s = "";
    public static void main(String[] args) {
        String[] str = { "f$ec", "ec" };
        System.out.println(isDollarDeleteEqual(str));
    }

    private static boolean isDollarDeleteEqual(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = removeDollar(str[i]);
        }

        for (int i = 1; i < str.length; i++) {
            if (str[i].equalsIgnoreCase(str[i - 1]))
                continue;
            else
                return false;
        }
        return true;
    }

    private static String removeDollar(String str) {
        int counter = 0;
        s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '$')
                counter++;
            else {
                if (counter > 0)
                    counter--;
                else
                    s = str.charAt(i)+s;
            }
        }
        return s;
    }
}
