package com.skillnext;

import java.util.Scanner;

public class Palindrome {
    // Check if a string or number is palindrome
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string or number: ");
        String input = sc.nextLine().trim();
        String cleaned = input.replaceAll("\\s+", ""); // remove spaces if you want
        boolean isPalindrome = isPalindrome(cleaned);
        System.out.println(input + (isPalindrome ? " is a palindrome." : " is NOT a palindrome."));
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
