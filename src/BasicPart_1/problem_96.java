package BasicPart_1;

import java.util.Scanner;

public class problem_96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter "+n+" element");
        for (int i=0;i< array.length;i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        if (check(array)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static boolean check(int[] array){
        int findex =0;
        int lindex =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] ==10){
                findex = i;
            }
            if (array[i]==20){
                lindex = i;
            }
        }
        if (findex<lindex){
            return true;
        }
        return false;
    }
}
