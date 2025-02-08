package BasicPart_2;
import java.util.Arrays;
import java.util.Scanner;
public class problem_160 {
    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);
        int[] array ={1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original array\n"+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("Enter the value of k: ");
        k = scanner.nextInt();
        int[] smallest = new int[k];
        for (int i = 0; i < k; i++) {
            smallest[i] = array[i];
        }
        System.out.println(k+" smallest elements are\n"+Arrays.toString(smallest));
    }
}
