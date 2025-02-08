package BasicPart_1;

import java.util.Scanner;

public class problem_74 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
       if (array.length>=2){
           if (array[0]==10 || array[array.length-1]==10){
               System.out.println("true");
           }else{
               System.out.println("false");
           }
       }
    }
}
