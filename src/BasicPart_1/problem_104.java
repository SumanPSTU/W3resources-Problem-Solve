package BasicPart_1;

import java.util.Arrays;
public class problem_104 {
    public static void main(String[] args) {
        int[] array = {11, 15, 13, 10, 45, 20, 33, 53};
        int index = 0;
        for (int i =0;i<array.length;i++){
            if (array[i] == 10){
                index = i;
                break;
            }
        }
        System.out.println("Main array ");
        System.out.println(Arrays.toString(array));
        int[] subarray = new int[index];
        for (int i= 0;i<subarray.length;i++){
            subarray[i] = array[i];
        }
        System.out.println("Sub array ");
        System.out.println(Arrays.toString(subarray));
    }
}
