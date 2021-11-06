package com.SimpleLogic.ext;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		int i = 1;
		int count = 0;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = value.nextInt();
		while (i <= number / 2) {

			if (number % i == 0) {
				sum = sum + i;
				System.out.print(i + " ");
			}
			i++;
		}
		if (sum == number) {
			System.out.println("the number is a perfect number :");
		} else {
			System.out.println("the number is not perfect number :");
		}

	}
}
