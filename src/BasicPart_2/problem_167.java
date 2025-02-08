package BasicPart_2;
import java.util.Arrays;
public class problem_167 {
    public static void main(String[] args) {
        int[] array = {0, 3, 4, 0, 1, 2, 5, 0};
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]==0){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
    }
}
