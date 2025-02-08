package BasicPart_1;

import java.util.Scanner;

public class problem_98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element of the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element for the array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        if (check(arr)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
    public static boolean check(int[] array){
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] ==20 && array[i]==array[i+1]){
                count++;
            }
        }
        if (count>=3){
            return true;
        }
        return false;
    }
}
