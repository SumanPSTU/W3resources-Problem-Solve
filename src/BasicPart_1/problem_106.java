package BasicPart_1;

import java.util.Arrays;
public class problem_106 {
    public static void main(String[] args) {
        System.out.println("original array");
        int[] array = {4,5,3,6,8,7,9,11,23,45};
        System.out.println(Arrays.toString(array));
        int temp = array[0];
        for (int i = 0;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
        System.out.println("left shifting array");
        System.out.println(Arrays.toString(array));

    }
}
