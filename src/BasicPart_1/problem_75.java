package BasicPart_1;

import java.util.Scanner;

public class problem_75 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        num = scanner.nextInt();
        int[] array = new int[num];
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        if (array.length>=2){
            if (array[0]== array[array.length-1]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
