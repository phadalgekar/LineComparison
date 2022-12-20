package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
//UC2 checking two lines are equal or not
		
		System.out.println("Enter points for first line:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter point y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter point x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter point y2: ");
        int y2 = sc.nextInt();
        Double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of first line: " + length1);

        System.out.println("\nEnter points for second line:");
        System.out.println("Enter point x3: ");
        int x3 = sc.nextInt();
        System.out.println("Enter point y3: ");
        int y3 = sc.nextInt();
        System.out.println("Enter point x4: ");
        int x4 = sc.nextInt();
        System.out.println("Enter point y4: ");
        int y4 = sc.nextInt();
        Double length2 = Math.sqrt((Math.pow((x4 - x3), 2)) + (Math.pow((y4 - y3), 2)));
        System.out.println("Length of second line is: " + length2);

        boolean result  = length2.equals(length1);

        if ( result == true ) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
	}
        sc.close();
	}
}


	

