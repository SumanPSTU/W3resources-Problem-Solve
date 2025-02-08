package BasicPart_1;

import java.util.Scanner;

public class problem_102 {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i =0;i<array.length;i++){
            if (array[i] == 10 || array[i] == 30){
                result = 1;
            }
        }
        if (result == 0){
            System.out.println(String.valueOf(false));
        }else {
            System.out.println(String.valueOf(true));
        }

    }
}
