// Fizz Buzz is a classic interview question that apparently many engineering candidates can't solve! Let's cover it today.

//We're given a number in the form of an integer n.

//Write a function that returns the string representation of all numbers from 1 to n based on the following rules:

//If it's a multiple of 3, represent it as "fizz".

//If it's a multiple of 5, represent it as "buzz".

//If it's a multiple of both 3 and 5, represent it as "fizzbuzz".

//If it's neither, just return the number itself.

//As such, fizzBuzz(15) would result in '12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz'.

/*
 * 
 */

package main.java.AlgoDaily;

public class FizzBuzz {
	
	public static void main(String[] args) {
		int n=15;
		System.out.println(makeFizzBuzz(n));
	}
	
static String makeFizzBuzz(int n) {
	String s="";
	for(int i=1;i<=n;i++) {
		if(i%3==0 && i%5==0)
			s+="fizzbuzz";
		else if(i%3==0)
			s+="fizz";
		else if(i%5==0)
			s+="buzz";
		else
			s+=i;
	}
	return s;
	
}
}
