package BasicPart_2;
import java.util.Arrays;
public class problem_162 {
    public static void main(String[] args) {
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        int sum =0,avg = 0;
        for (int i =0 ; i<array.length;i++){
            sum+=array[i];
        }
        avg = sum/array.length;
        System.out.println("Array is\n"+Arrays.toString(array));
        System.out.println("Average of the array is "+avg);
        System.out.println("greater number than average");
        maxAvg(array,avg);
    }
    static void maxAvg(int[] max,int avg){
        Arrays.sort(max);
        for (int i = 0; i < max.length; i++) {
            if (max[i]>avg){
                System.out.print(max[i]+" ");
            }
        }

    }
}
