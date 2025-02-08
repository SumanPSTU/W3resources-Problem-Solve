package BasicPart_1;

import java.util.Scanner;

public class problem_117 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scanner.nextInt();
        System.out.printf("Squire root of %d is %.2f",n,Math.sqrt(n));
    }
}
