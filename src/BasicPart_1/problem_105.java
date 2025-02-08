package BasicPart_1;

public class problem_105 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println(check(array_nums));
    }
    public static boolean check(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[0] == arr[arr.length-2] && arr[1]== arr[arr.length-1]){
                return true;
            }
        }
        return false;
    }
}
