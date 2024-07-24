package com.task1;
import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count =0;
		if(num==0)
			count = 1;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("The number of digits in given number is "+count);
	}

}
