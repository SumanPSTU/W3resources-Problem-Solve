package BasicPart_2;
import java.util.Arrays;
import java.util.Scanner;
public class problem_161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original array\n"+ Arrays.toString(array));
        System.out.print("Enter the value of k: ");
        k = scanner.nextInt();
        Arrays.sort(array);
        int len = array.length-1;
        int[] smallest = new int[k];
        int[] largest = new int[k];
        for (int i = 0; i < k; i++) {
            smallest[i] = array[i];
            largest[i] = array[len];
            len--;
        }
        System.out.println("Smallest "+Arrays.toString(smallest));
        System.out.println("Largest "+Arrays.toString(largest));
    }
}
