package Recursion;

public class problem_5 {

    public static double calculateExponentiation(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculateExponentiation(base, exponent - 1);
    }

    public static void main(String[] args) {
        double base = 3.5;
        int exponent = 4;
        double result = calculateExponentiation(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
