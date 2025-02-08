package Recursion;

import java.util.Scanner;

public class problem_1 {
    static int CalculateFactorial(int n){
        if (n == 0) return 1;
        return n * CalculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();

        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        } else {
            System.out.println("The factorial of " + n + " is " + CalculateFactorial(n));
        }
    }
}
