package BasicPart_2;
import java.util.Arrays;
public class problem_165 {
    public static void main(String[] args) {
        int[] nums = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        System.out.println("Original array");
        System.out.println(Arrays.toString(nums));
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    static int[] insertionSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int j = i-1;
            int current = nums[i];
            while (j>=0 && nums[j]>current){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }

        return nums;
    }
}