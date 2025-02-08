package ConditionalStatement;

import java.util.Scanner;
public class problem_11 {
    public static void main(String[] args){
        System.out.print("Input a number: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        System.out.println("Input number is "+n);
        System.out.println("First "+n+" natural number are ");
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println("\nSum of those natural number "+sum);
    }
}
