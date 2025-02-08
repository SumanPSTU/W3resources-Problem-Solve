package ConditionalStatement;

import java.util.Scanner;

public class problem_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int sum  = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2!=0) sum+=i;
        }
        System.out.println("Sum of n odd natural number is "+sum);
    }
}
