package BasicPart_1;

import java.util.Arrays;
import java.util.Scanner;

public class problem_83 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        num = scanner.nextInt();
        int[] fArray = new int[num];
        int[] lArray = new int[num];
        int[] newArray = new int[num];
        System.out.println("Enter first array element");
        for (int i = 0; i < fArray.length; i++) {
            fArray[i] = scanner.nextInt();
        }
        System.out.println("Enter second array element");
        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = fArray[i]*lArray[i];
        }
        System.out.println("Arrays multiplication");
        System.out.println(Arrays.toString(newArray));
    }
}
