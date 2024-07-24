package com.task1;
import java.util.Scanner;
public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>60)
			System.out.println("The person is Senior Citizen");
		else
			System.out.println("The person is not Senior Citizen");
	}

}
