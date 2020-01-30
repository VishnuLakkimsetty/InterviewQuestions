/*
 * An ideal number is a positive integer that has only 3 and 5 as prime divisors. An ideal number can be expressed
 * in form of 3^x * 5^y, where x and y are non -ve integers. For example 15, 45, 75 are ideal numbers but 6,10 and 21
 * are not.
 * 
 * Here's the question - Find the number of ideal integers within the given segment [low,high] inclusive
 * 
 * Example:
 * low = 200
 * high = 405
 * 
 * There are 4 ideal numbers in this range [200,405] inclusive:
 * 225, 243, 375, 405.
 * 
 * 
 * Constraints:
 * 1<=low<=high<= 2*10^9
 * 
 * 
 */
package main.java.Qualcomm;

public class IdealNumbers {
	public static void main(String[] args) {
		int low = 200;
		int high = 405;
		findIdealNumbers(low,high);
	}

	private static void findIdealNumbers(int low, int high) {
		long arraySize = 0;
	    long num = high;
	    while(num != 0){
	        num = num/3;
	        arraySize++;
	    }
	    arraySize++;
	    long[] power3 = new long[(int)arraySize];
	    long[] power5 = new long[(int)arraySize];
	    for(int i=0;i<arraySize;i++){
	        power3[i] = (long)Math.pow(3, i);
	        power5[i] = (long)Math.pow(5, i);
	    }
	    
	    System.out.println("Ideal numbers are ::");
	    for(int i=0;i<arraySize;i++){
	        for(int j=0;j<arraySize;j++){
	            long product = power3[i]*power5[j];
	            if(low<=product && product<=high){
	                System.out.println(product);;
	            }
	        }
	    }
		
	}

}
