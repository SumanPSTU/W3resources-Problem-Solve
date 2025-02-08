package ConditionalStatement;

import java.util.Scanner;

public class problem_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
