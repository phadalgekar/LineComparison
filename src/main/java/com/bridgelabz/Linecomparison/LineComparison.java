package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	static int x1, x2, y1, y2, m1, m2, n1, n2;
    static String str1, str2;
    static double length, length2;
    public static void length1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first two co-ordinates:");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter second two co-ordinates:");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of the line:" + length);
        str1 = Double.toString(length);
        sc.close();
    }

    public static void length2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter third co-ordinates:");
        m1 = sc.nextInt();
        n1 = sc.nextInt();
        System.out.println("Enter fourth co-ordinates:");
        m2 = sc.nextInt();
        n2 = sc.nextInt();
        length2 = Math.sqrt(Math.pow((m2 - m1), 2) + Math.pow((n2 - n1), 2));
        System.out.println("Length of the line:" + length2);
        str2 = Double.toString(length2);
        sc.close();
    }
    public double checkComputeToMethod() {
        System.out.println("\n * Check with Equal Method");
        double check = str1.compareTo(str2);
        if (check == 0)
            System.out.println("The two lines are equal\n");
        else if (check < 0.0)
            System.out.println("Line1 is smaller than Line2\n");
        else
            System.out.println("Line1 is greater than Line2\n");
        return( check);
    }
   public void checkEqualMethod(){
       System.out.println("Check with Equal Method");
       if (str1.equals(str2)) {   // Check the Lines are equal or not
           System.out.println("Two Lines are Equals");
       }
       else
           System.out.println("Two Lines are Not Equals\n");
   }
	public static void main(String[] args) {
		LineComparison l1=new LineComparison();
        System.out.println("Welcome to Line Comparison Computation Program");
        length1();
        length2();
       l1.checkComputeToMethod();
	}
	}

	
	


	

