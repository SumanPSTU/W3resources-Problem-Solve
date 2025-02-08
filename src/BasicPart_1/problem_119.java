package BasicPart_1;

public class problem_119 {
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 7, 8};
        int target = 7;
        for (int i =0;i<nums.length;i++){
            if (nums[i] == target){
                System.out.println("Target index is "+i);
            }
        }
    }
}
