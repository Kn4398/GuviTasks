package com.task1;

import java.util.Scanner;

public class GreaterOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		if((a+b)>(c+d))
			System.out.println("Sum of A and B is greater than Sum of C and D");
		else
			System.out.println("Sum of C and D is greater than Sum of A and B");

	}

}
