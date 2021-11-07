package com.SimpleLogic.ext;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to start the stopwatch");
		int startValue = sc.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("enter 2 to start the stopwatch");
		int stopValue = sc.nextInt();
		long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed);
    }
		
}
