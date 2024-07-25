package com.task2;
import java.util.Scanner;
public class PrintingPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the pattern: ");
	        int n = scanner.nextInt();
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < n; j++) {
	                    if (i == j || i + j == n - 1) {
	                        System.out.print("*");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println();
	            }
	        }
	}
