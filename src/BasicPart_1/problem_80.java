package BasicPart_1;

import java.util.Scanner;

public class problem_80 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three element");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Max num is "+max);
    }
}
