package Recursion;
public class problem_9 {
    public static int calculateOdd(int[] arr) {
        return calculateOdd(arr, 0);
    }
    private static int calculateOdd(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        int sum = calculateOdd(arr, index + 1);
        if (arr[index] % 2 != 0) {
            sum += arr[index];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = calculateOdd(numbers);
        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }
}
