package BasicPart_2;
import java.util.Arrays;
public class problem_170 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2 };
        System.out.println("Array is\n"+ Arrays.toString(nums));
        System.out.println("longest consecutive sequence\n"+longest_consecutive_sequence(nums));
    }
    static int longest_consecutive_sequence(int[] nums){
        if (nums==null){
            throw new IllegalArgumentException("Null array...");
        }
        if (nums.length == 0){
            return 0;
        }
        for (int i =0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
}
