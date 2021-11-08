package com.JUnitTesting.ext;

// to find the day of the week

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		int x,Y ,D ,M ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day :");
		int day = sc.nextInt();
		System.out.println("Enter the month :");
		int month = sc.nextInt();
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		if ((day<=31)&&(month<=12)) {
			Y=year - (14 - month)/12;
			x=Y + Y/4 -Y/100+ Y/400;
			M=month +12 *((14 -month)/12)-2;
			D=(day + x +31*M/12)%7;
			System.out.println( Y +" "+M+" "+D);
			switch (D) {
			case 0:
				System.out.println(day+"-"+month+"-"+year+"  is Sunday");
				break;
		    case 1:
				System.out.println(day+"-"+month+"-"+year+"  is Monday");
				break;
		    case 2:
				System.out.println(day+"-"+month+"-"+year+"  is Tuesday");
				break;
		    case 3:
				System.out.println(day+"-"+month+"-"+year+"  is Wednesday");
				break;
		    case 4:
				System.out.println(day+"-"+month+"-"+year+"  is Thursday");
				break;
		    case 5:
				System.out.println(day+"-"+month+"-"+year+"  is Friday");
				break;
		    case 6:
				System.out.println(day+"-"+month+"-"+year+"  is Saturday");
				break;
            default:
				break;
				}
		} else {
            System.out.println("invalid data");
	
		}
			
		
	}

}
