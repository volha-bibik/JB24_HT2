package com.company.ht2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        double radius, squere = 0, length = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius : ");
        while(!sc.hasNextDouble()) {
            sc.next();
        }
        radius = sc.nextDouble();

        if (radius <= 0) {
            System.out.println("Radius can't be less or equal zero!");
        } else {
            squere = Math.PI * Math.pow(radius, 2);
            length = 2 * Math.PI * radius;
            System.out.println("Circle square = " + squere + "; length = " + length);
        }
    }
}
