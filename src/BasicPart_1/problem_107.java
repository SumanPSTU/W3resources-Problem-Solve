package BasicPart_1;

public class problem_107 {
    public static void main(String[] args) {
        int[] array_nums = {11, 12, 13, 14, 45, 20};
        System.out.println(check(array_nums));
    }
    public static boolean check(int[] array){
        for (int i=0;i<4;i++){
            if (array[i]+1 == array[i+1]){
                return true;
            }
        }
        return false;
    }
}
