package BasicPart_1;

import java.util.Arrays;

public class problem_100 {
    public static void main(String[] args) {
        int[] array1 ={10, 11, 10, 20, 43, 20, 50};
        int[] array2 ={10, 13, 11, 20, 44, 30, 50};
        System.out.println("Arrar_1 "+ Arrays.toString(array1));
        System.out.println("Arrar_2 "+ Arrays.toString(array2));
        int count =0;
        for (int i = 0; i < array1.length; i++) {
            if (Math.abs(array1[i] - array2[i]) <= 1 && array1[i] != array2[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}