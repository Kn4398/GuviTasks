package com.task2;
import java.util.Scanner;
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println(num1 + " is the greatest.");
		}
		else if((num2>num3)&&(num2>num3)) {
			System.out.println(num2 + " is the greatest.");
		}
		else
			System.out.println(num3 + " is the greatest.");
	}

}
