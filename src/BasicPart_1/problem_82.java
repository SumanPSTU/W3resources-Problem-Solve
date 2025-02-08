package BasicPart_1;

import java.util.Scanner;
public class problem_82 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the length of array");
            num = scanner.nextInt();
        } while (num < 3);
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int mid = (int) Math.ceil(array.length / 2.0)-1;
        int max = array[0];
        if (max<array[mid]){
            max =array[mid];
        }
        if (array[array.length-1]> max){
            max = array[array.length-1];
        }
        System.out.println("Max number is "+max);
    }
}
