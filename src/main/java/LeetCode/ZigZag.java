// https://leetcode.com/problems/zigzag-conversion/

package main.java.LeetCode;

public class ZigZag {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int num = 3;
		System.out.print(convertZigZag(s, num));
	}

	private static String convertZigZag(String s, int numRows) {
		int indexRow = (numRows-1)*2,lastRow = (numRows-1)*2;
        int n = s.length();
        if(n==1 || numRows == 1){
            return s;
        }
        
        String res = "";
        int i;
        for(i=0; indexRow>=2; i++){
            int rem = lastRow - indexRow;
            int j =i;
            while(j<n){
                res = res + s.charAt(j);
                j = j+indexRow;
                if(rem!=0 && j<n){
                    res = res + s.charAt(j);
                    j = j+rem;
                }
                
            }
            indexRow = indexRow-2;
        }
        
        while(i<n){
            res = res + s.charAt(i);
            i = i+lastRow;
        } 
        
        return res;
	}
}
