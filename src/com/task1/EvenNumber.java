package com.task1;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a%2==0)
			System.out.println("Given number is Even number");
		else
			System.out.println("Given number is Odd number");
	}

}
