package BasicPart_1;

import java.util.Arrays;
import java.util.Scanner;

public class problem_81 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the length of array");
            num = scanner.nextInt();
        }while (num<=1);

        int[] array = new int[num];
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array "+ Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;

        }
        System.out.println("Reverse array "+Arrays.toString(array));
    }
}
