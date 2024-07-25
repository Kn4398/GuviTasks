package com.task2;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		
		char[] chArray = input.toCharArray();
		int len = chArray.length;
		
		for (int i = 0; i < len / 2; i++) {
            char temp = chArray[i];
            chArray[i] = chArray[len - i - 1];
            chArray[len - i - 1] = temp;
        }
		System.out.println("The reversed string is: " + new String(chArray));
	}

}
