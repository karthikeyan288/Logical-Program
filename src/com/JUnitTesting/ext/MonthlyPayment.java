package com.JUnitTesting.ext;

//to find the monthly payment

import java.util.Scanner;

public class MonthlyPayment {
	 public static void main(String[] args) {
		int n =12;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount :");
		int P = sc.nextInt();
		System.out.println("Enter the Year :");
		int Y = sc.nextInt();
		System.out.println("Enter the Percentage :");
		int R = sc.nextInt();
		int r =R/(12 * 100);
	    int time = Y*12;
		double p =(P * r) / (1 - Math.pow(1 + r ,-time));
		System.out.println("The Monthly Payment is "+p);
		
	}

}
