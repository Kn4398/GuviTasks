package com.task2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.next();
		
		char[] chArray = input.toCharArray();
        int length = chArray.length;
        
        boolean isPalindrome = true;
        for (int i = 0; i < length / 2; i++) {
            if (chArray[i] != chArray[length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        
        // Print the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

	}

}
