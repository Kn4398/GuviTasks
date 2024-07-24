package com.task1;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println(num+" is Prime number");
		else
			System.out.println(num+" is not Prime number");
	}

}
