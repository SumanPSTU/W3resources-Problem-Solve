package BasicPart_2;
public class problem_172 {
    public static void main(String[] args) {
        int[] mainArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] query_array = {1, 4, 8};
        int count =0;
        for (int i = 0; i < query_array.length; i++) {
            for (int j = 0; j < mainArray.length; j++) {
                if (query_array[i]>mainArray[j]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
