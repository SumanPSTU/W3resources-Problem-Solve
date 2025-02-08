package ConditionalStatement;
import java.util.Scanner;

public class problem_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        num1 = Math.round(num1 * 100.0) / 100.0;
        num2 = Math.round(num2 * 100.0) / 100.0;
        if (num1 == num2) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are different up to two decimal places.");
        }

        scanner.close();
    }
}
