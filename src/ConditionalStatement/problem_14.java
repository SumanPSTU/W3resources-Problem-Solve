package ConditionalStatement;

import java.util.Scanner;

public class problem_14 {
    public static void main(String[]args){
        System.out.print("Enter an integer number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("The multiplication table is");
        for (int i = 1; i <=10; i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
