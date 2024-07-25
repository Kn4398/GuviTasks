package com.task2;
import java.util.Scanner;
public class HotelTarrif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month of stay: ");
		int month = sc.nextInt();
		System.out.print("Enter the rent of stay: ");
		double rent = sc.nextFloat();
		System.out.print("Enter the days of stay: ");
		int days = sc.nextInt();
		
		switch(month) {
		case 1:{
			System.out.println(rent*days);
			break;
		}
		case 2:{
			System.out.println(rent*days);
			break;
		}
		case 3:{
			System.out.println(rent*days);
			break;
		}
		case 4:{
			rent = rent+(rent*0.2);
			System.out.println(rent*days);
			break;
		}
		case 5:{
			rent = rent+(rent*0.2);
			System.out.println(rent*days);
			break;
		}
		case 6:{
			rent = rent+(rent*0.2);
			System.out.println(rent*days);
			break;
		}
		case 7:{
			System.out.println(rent*days);
			break;
		}
		case 8:{
			System.out.println(rent*days);
			break;
		}
		case 9:{
			System.out.println(rent*days);
			break;
		}
		case 10:{
			System.out.println(rent*days);
			break;
		}
		case 11:{
			rent = rent+(rent*0.2);
			System.out.println(rent*days);
			break;
		}
		case 12:{
			rent = rent+(rent*0.2);
			System.out.println(rent*days);
			break;
		}
		default:
			System.out.println("Invalid Month value");
		}
	}

}
