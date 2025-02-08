package BasicPart_2;

public class problem_178 {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};
        System.out.println("Size of longest increasing continuous subsequence: "+Check(array));
    }
    static int Check(int[] array){
        int count = 1;
        if (array.length==1) return 1;
        for (int i = 1;i<array.length;i++){
            if (array[i]>array[i-1]){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
