package com.task1;
import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c;
		System.out.println("Values before swap:"+ a + " "+ b);
		c = a;
		a = b;
		b = c;
		System.out.println("Values after swap:"+ a + " "+ b);
	}

}
