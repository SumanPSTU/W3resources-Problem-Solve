package Recursion;
import java.util.Scanner;
public class problem_7 {
    public static int GCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        int remainder = num1 % num2;
        return GCD(num2, remainder);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer");
        int number1 =scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        int gcd = GCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
