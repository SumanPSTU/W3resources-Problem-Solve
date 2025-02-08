package Recursion;
public class problem_14 {
    public static int calculateDigitSum(int number) {
        if (number < 10) {
            return number;
        }
        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        return lastDigit + calculateDigitSum(remainingNumber);
    }
    public static void main(String[] args) {
        int number = 123456;
        int digitSum = calculateDigitSum(number);
        System.out.println("The sum of the digits of " + number + " is: " + digitSum);
    }
}
