package BasicPart_1;

public class problem_97 {
    public static void main(String[] args) {
        int[] array_nums = {10,2,10,50,20,13,50};

        int result = 0;
        int x = 20;
        for (int i=0;i<array_nums.length;i++){
            if (array_nums[i] == x && array_nums[i+1]==x){
                System.out.println(String.valueOf(true));
                result = 1;
            }
            if (i<=array_nums.length-3 && array_nums[i] ==x && array_nums[i+2]==x){
                System.out.println(String.valueOf(true));
                result = 1;
            }
        }
        if (result==0){
            System.out.println(String.valueOf(false));
        }else {
            System.out.println(String.valueOf(true));
        }
    }
}
