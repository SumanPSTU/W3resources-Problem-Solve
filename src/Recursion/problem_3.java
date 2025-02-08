package Recursion;

import java.util.Scanner;

public class problem_3 {
    static int CalculateFibonacci(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return CalculateFibonacci(n-1)+CalculateFibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Sum of fibonacci number is "+CalculateFibonacci(n));
    }
}
