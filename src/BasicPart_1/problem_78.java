package BasicPart_1;

import java.util.Scanner;
public class problem_78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isExist(arr));
    }
    public static boolean isExist(int[] array){
        for (int i=0;i<array.length;i++){
            if (array[i]==4 || array[i]==7){
                return true;
            }
        }
        return false;
    }
}
