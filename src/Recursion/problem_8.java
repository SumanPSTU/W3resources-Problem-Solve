package Recursion;
public class problem_8 {
    public static < T > int countOccurrences(T[] arr, T target) {
        return countOccurrences(arr, target, 0);
    }
    private static < T > int countOccurrences(T[] arr, T target, int index) {
        if (index == arr.length) {
            return 0;
        }
        int count = countOccurrences(arr, target, index + 1);
        if (arr[index].equals(target)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {10,20,30,40,20,50,20,60};
        int target = 20;
        int occurrences = countOccurrences(numbers, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
    }
}
