package com.company.ht2;

import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        double a, b, c, d, result;
        double[] arguments = new double[4];
        Scanner sc = new Scanner(System.in);

        for (int i = arguments.length - 1; i >= 0; i--) {
            System.out.println("Enter argument : ");
            while(!sc.hasNextDouble()) {
                sc.next();
            }
            arguments[i] = sc.nextDouble();
        }
        a = arguments[3];  b = arguments[2]; c = arguments[1]; d = arguments[0];

 /*       System.out.println("Enter a: ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        c = sc.nextDouble();
        System.out.println("Enter d: ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        d = sc.nextDouble();
*/
        if (a == 0) {
            System.out.println("You try to divide by zero!");
            result = Double.NaN;
        } else {
            result = ((b + Math.sqrt(b * b + 4 * a * c))/(2 * a)) - Math.pow(a, 3) + d;
        }

        System.out.println("Result = " + result);
    }
}
