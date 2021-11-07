package com.SimpleLogic.ext;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reversenum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		while (num != 0) {
			int reminder = num % 10;
			reversenum = reversenum * 10 + reminder;
			num = num / 10;
		}

		System.out.println("Reverse of input number is: " + reversenum);

	}

}
