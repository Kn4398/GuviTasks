package com.task4;
import java.util.Scanner;
public class IndexOutOfBoundException {
		public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the array index value:");
	    	int arrayIndex = sc.nextInt();
	    	int[] array = new int[arrayIndex];
	    	System.out.println("Enter the values to be stored in the array:");
	    	for(int i=0;i<arrayIndex;i++) {
	    		array[i]=sc.nextInt();
	    	}
	        try {
	        	System.out.println("Enter the search array index value:");
	        	int search = sc.nextInt();
	        	System.out.println(array[search]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        }
	        
	        System.out.println("Enter the String value:");
	        String str = sc.nextLine();
	        str.toCharArray();
	        try {
	        	System.out.println("Enter the search array index value:");
	        	int search1 = sc.nextInt();
	            System.out.println(str.charAt(search1));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String index is out of bounds.");
	        }
	        sc.close();
	    }
}

