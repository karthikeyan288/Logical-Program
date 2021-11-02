package com.SimpleLogic.ext;
// to find Fibonacci Series for given number
import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number :" );
		int number = value.nextInt();
		System.out.println("The Fibonacci Series of "+number+ " numbers are :");
		for (int i = 0; i < number; i++) {
			System.out.print(num1 +" ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
		 }
		
		
		System.out.println("");
		
	}

}
