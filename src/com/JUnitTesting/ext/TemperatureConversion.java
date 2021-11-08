package com.JUnitTesting.ext;

//to convert temperature to celsius or viceversa

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1.convert to celsius , 2.convert to fahrenheit:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the fahrenheit :");
			int fahran = sc.nextInt();
			int C = (fahran -32)* 5/9;
			System.out.println("The temperature in celsius :" +C);
			break;
		case 2 :
			System.out.println("Enter the celsius :");
			int cels = sc.nextInt();
			int F = (cels * 9/5)+25; 
			System.out.println("The temperature in farenheit :"+F);
		default:
			break;
		}
		
	}

}
