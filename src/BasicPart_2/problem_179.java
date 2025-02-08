package BasicPart_2;

import java.util.Arrays;

public class problem_179 {
    public static void main(String[] args){
        int[] array = {9,9,9,9};
        int sum = 0;
        for (int i:array){
            sum = sum*10+i;
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
       String str = String.valueOf(sum+1);
        int[] subArray = new int[str.length()];
        for (int i = 0;i<subArray.length;i++){
            subArray[i] = (int) str.charAt(i)-48;
        }
        System.out.println("Array of digit");
        System.out.println(Arrays.toString(subArray));
    }
}
