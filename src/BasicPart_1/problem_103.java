package BasicPart_1;

import java.util.Arrays;

public class problem_103 {
    public static void main(String[] args) {
        int[] array = {11, 10, 13, 10, 45, 20, 33, 53};
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10){
                index = i+1;
            }
        }
        System.out.println("main array");
        System.out.println(Arrays.toString(array));
        int[] subArray = new int[array.length-index];
        for (int i =0;i<subArray.length;i++){
            subArray[i] = array[index];
            index++;
        }
        System.out.println("Sub array");
        System.out.println(Arrays.toString(subArray));
    }
}
