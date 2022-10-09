package com.functional;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Rows (m)");
        int m = scan.nextInt();
        System.out.println("Enter number of columns (n)");
        int n = scan.nextInt();
        int[][] array = new int[m][n];
        TwoDimensionalArray obj = new TwoDimensionalArray();
        obj.outerArray(array);
        obj.innerArray(array);
    }

    void outerArray(int[][] array) {
        Random randomInt = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randomInt.nextInt(100);
            }
        }
    }

    void innerArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}

