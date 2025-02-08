package BasicPart_1;

import java.util.Arrays;
import java.util.Scanner;

public class problem_79 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] rotateArr = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original array "+ Arrays.toString(arr));
        rotateArr[2] = arr[0];
        rotateArr[1] = arr[1];
        rotateArr[0] = arr[2];
        System.out.println("rotate array "+Arrays.toString(rotateArr));
    }
}
