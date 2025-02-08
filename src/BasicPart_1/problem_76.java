package BasicPart_1;

import java.util.Scanner;

public class problem_76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        if (arr.length>=2){
            if (arr[0]==arr[arr.length-1]){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("array length must be greter than 2");
        }
    }
}
