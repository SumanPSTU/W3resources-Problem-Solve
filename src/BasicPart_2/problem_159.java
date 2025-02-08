package BasicPart_2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class problem_159 {
    public static void main(String[] args) {
        int k,n;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the length of array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the value of k: ");
        k = scanner.nextInt();
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Original array");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int[] largest = new int[k];
        int len = array.length-1;
        for (int i =0;i<k;i++){
            largest[i] = array[len];
            len--;
        }
        System.out.println(k+" largest element\n"+Arrays.toString(largest));
    }
}
