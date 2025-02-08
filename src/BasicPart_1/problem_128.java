package BasicPart_1;

import java.util.Arrays;

public class problem_128 {
    public static void main(String[] args) {
        int[] nums = {10, 2, 38, 22, 38, 23};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("Median of the said array of integers: " + getMedian(nums));

        int[] nums1 = {10, 2, 38, 23, 38, 23, 21};
        System.out.println("\nOriginal array: " + Arrays.toString(nums1));
        System.out.println("Median of the said array of integers: " + getMedian(nums1));
    }

    public static double getMedian(int[] array) {
        Arrays.sort(array); // Sort the array first
        int length = array.length;
        if (length % 2 == 0) {
            // If even, return the average of the two middle elements
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            // If odd, return the middle element
            return array[length / 2];
        }
    }
}
