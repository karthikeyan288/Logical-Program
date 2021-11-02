package com.SimpleLogic.ext;

import java.util.Scanner;
// to find prime number
public class PrimeNumber {
	public static void main(String[] args) {
		int num =1;
		int count=0;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int number = value.nextInt();
		for (int i = 2; i <number; i++) {
			if (number%i==0) {
				count++;
				break;
			  }
		    }	
			if (count==0) {
				System.out.println(number+" is a prime number ");
			} else {
				System.out.println(number+" is a not prime number ");
			}
		
			
		
	}

}
