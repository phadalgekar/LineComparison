package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
//UC1 calculating length of line between two points		
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter point y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter point x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter point y2: ");
        int y2 = sc.nextInt();
        double length = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of Line between two points: " + length);
        
        sc.close();
	}

}


