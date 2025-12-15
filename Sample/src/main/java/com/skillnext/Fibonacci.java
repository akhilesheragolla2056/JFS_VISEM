package com.skillnext;

import java.util.Scanner;

public class Fibonacci {
    // Print first n Fibonacci numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (count of Fibonacci numbers): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }
        long a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : " "));
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
