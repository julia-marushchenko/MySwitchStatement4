/**
 *  Java program to demonstrate switch statement to find if letter is
 *  vowel or consonant with enhanced switch statement.
 */

package com.myswitch;

import java.util.Scanner;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating scanner instance.
        Scanner sc = new Scanner(System.in);

        // Reading character from console.
        char ch = sc.next().charAt(0);

        // Creating switch statement.
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println("Vowel");
            }
            default ->
                System.out.println("Consonant");

        }
    }
}