package BasicPart_2;

import java.util.Scanner;

public class problem_173 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        String s = "";
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int left = 0;

        while (left<array.length-k+1){
            int right = left+k-1;
            int mid = (left+right)/2;
            s+=array[mid]+" ";
            left++;
        }
        System.out.println(s.trim());
    }
}
