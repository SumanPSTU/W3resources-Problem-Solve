package BasicPart_2;
import java.util.Arrays;
public class problem_176 {
    public static void main(String[] args) {
        int[] array = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        System.out.println("Original Array\n"+Arrays.toString(array));
        System.out.println("Partition array\n"+Arrays.toString(partition(array)));
    }
    public static int[] partition(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left<right){
            if (array[left]%2!=0 && array[right]%2 == 0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            if (array[left] % 2 ==0){
                left++;
            }
            if (array[right] %2 != 0){
                right--;
            }
        }
        return array;
    }
}
