package BasicPart_1;

import java.util.Arrays;
public class problem_113 {
    public static void main(String[] args) {
        int[] arrOne = {4, 6, 4, 7, 2};
        int[] arrTwo = {8, 9, 3, 52, 6, 8};
        System.out.println(Arrays.toString(addArray(arrOne, arrTwo)));
    }
    public static int[] addArray(int[] arrOne, int[] arrTwo) {
        int[] newArr = new int[arrOne.length + arrTwo.length];
        System.arraycopy(arrOne, 0, newArr, 0, arrOne.length);
        System.arraycopy(arrTwo, 0, newArr, arrOne.length, arrTwo.length);
        Arrays.sort(newArr);
        return newArr;
    }
}
