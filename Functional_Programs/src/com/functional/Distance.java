package com.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please enter the x coordinate: ");
        int x = scan.nextInt();

        System.out.print(" Please enter the y coordinate: ");
        int y = scan.nextInt();

        System.out.println(" The point you have entered is: (" + x + ", " + y + ")");

        double length = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println(" The distance of the point from the origin is: " + length);

        scan.close();
    }
}

