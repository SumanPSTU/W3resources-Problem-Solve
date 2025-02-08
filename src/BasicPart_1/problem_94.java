package BasicPart_1;

import java.util.Arrays;

public class problem_94 {
    public static void main(String[] args) {
        int[] array ={9,13,24,35,76,9};
        int left =0;
        int right =array.length-1;
        Arrays.sort(array);
        while (left<right){
            while (array[left]%2!=0 && left<right){
                left++;
            }
            while (array[right] %2 == 0 && left<right){
                right--;
            }
            if (left<right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            left++;
            right--;
        }
        System.out.println(Arrays.toString(array));
    }
}
