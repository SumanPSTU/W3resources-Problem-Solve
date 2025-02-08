package BasicPart_1;

import java.util.Scanner;

public class problem_93 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Enter "+num+" element");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(isExist(array));
    }
    public static boolean isExist(int[] array){
        boolean is10 = false;
        boolean is20 = false;
        for (int i=0;i<array.length-1;i++){
            if (array[i] == 10||array[i+1]==10){
               is10 = true;
            }
            if (array[i] == 20||array[i+1]==20){
                is20 = true;
            }

        }
        if (is20==is10){
            return false;
        }
        return true;
    }
}
