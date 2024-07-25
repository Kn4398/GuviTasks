package com.task2;
import java.util.Scanner;
public class PrintingPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int i,j,num = 1;
		for(i=1; i<=len; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}

}
