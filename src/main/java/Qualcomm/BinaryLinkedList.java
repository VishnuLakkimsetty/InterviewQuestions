// https://www.geeksforgeeks.org/decimal-equivalent-of-binary-linked-list/

/*	
 * Solution approach:
 * ******************
 * 
 * First calculate the size of the linked and then convert the binary digit to decimal using basic conversion
 * 
 * Time Complexity: O(n) where n is size of linkedlist
 */

package main.java.Qualcomm;

public class BinaryLinkedList {
	static class Node  
	{  
	    int data;  
	    Node next;  
	};
	
	// Utility function to create a new node.  
	static Node newNode(int data)  
	{  
	    Node temp = new Node();  
	    temp.data = data;  
	    temp.next = null;  
	    return temp;  
	} 
	
	public static void main(String args[]) 
	{  
	    // Start with the empty list / 
	    Node head = newNode(1);  
	    head.next = newNode(0);  
	    head.next.next = newNode(1);  
	    head.next.next.next = newNode(1);  
	  
	    System.out.print( "Decimal value is ");  
	    decimalValueUsingSize(head);
	    decimalValueNotUsingSize(head);
	}

	private static void decimalValueNotUsingSize(Node head) {
		long number = 0;
		Node temp = head;
		System.out.println(temp.data);
		while(temp!=null) {
			number = (number*2)+temp.data;
			temp = temp.next;
		}
		System.out.print( "Decimal value is without size ");
		System.out.println(number);
		
	}

	private static void decimalValueUsingSize(Node head) {
		long number = 0;
	    int size = 0;
	    Node temp = head;
	    while(temp !=null){
	        size++;
	        temp = temp.next;
	    }
	    temp = head;
	    
	    while(temp!=null){
	        number = number + ((temp.data) * (long)Math.pow(2, --size));
	        temp = temp.next;
	    }
	    
	    System.out.println(number);
	}
}
