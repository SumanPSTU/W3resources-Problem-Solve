package ConditionalStatement;

import java.util.Scanner;
public class problem_12 {
    public static void main(String[] args){
        int[] array = new int[5];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five number");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i:array){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+sum/5.0);
    }
}
