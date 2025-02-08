package ConditionalStatement;

import java.util.Scanner;

public class problem_13 {
    public static void main(String[] args) {
        System.out.print("Enter an integer number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println("Number is "+i+" and cube of "+i+"is "+(i*i*i));
        }
    }
}
