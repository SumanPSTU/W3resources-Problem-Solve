package Recursion;

import java.util.Scanner;

public class problem_2 {
    static int CalculateSum(int n){
        if (n==0) return 0;
        return n+CalculateSum(n-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Sum of n natural number is "+CalculateSum(n));
    }
}
