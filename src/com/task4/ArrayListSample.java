package com.task4;
import java.util.ArrayList; 

public class ArrayListSample { 
	public static void main(String[] args) 
	{ 
		ArrayList<String> list = new ArrayList<>(); 
		list.add("Karthi"); 
		list.add("Saro"); 
		list.add("Rohith"); 
		list.add("Kiki"); 
		System.out.println("ArrayList: " + list); 
		System.out.println("Size of ArrayList = "
						+ list.size()); 
		list.clear(); 
		System.out.println("After clear\n"
						+ "ArrayList: " + list); 
		System.out.println("Size of ArrayList = "
						+ list.size()); 
	} 
} 
