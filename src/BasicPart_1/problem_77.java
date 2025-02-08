package BasicPart_1;

import java.util.Scanner;

public class problem_77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[2];
        int[] fArray = new int[3];
        int[] lArray = new int[3];
        System.out.println("Enter first array element");
        for (int i=0;i<fArray.length;i++){
            fArray[i] = scanner.nextInt();
        }
        System.out.println("Enter second array element");
        for (int i = 0; i < lArray.length; i++) {
            lArray[i] = scanner.nextInt();
        }
        newArray[0] = fArray[0];
        newArray[1] = lArray[lArray.length-1];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
