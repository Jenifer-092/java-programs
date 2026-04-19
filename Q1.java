package Strings;

import java.util.Scanner;

public class Q1 {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNullOrEmpty(input)) {
            System.out.println("String is NULL or contains only whitespace.");
        } else {
            System.out.println("String is NOT empty.");
        }

        sc.close();
    }
}