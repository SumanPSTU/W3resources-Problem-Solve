package BasicPart_1;

import java.util.Arrays;
import java.util.Scanner;

public class problem_95 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        n = scanner.nextInt();
        String[] line = new String[n];
        for (int i=0; i<line.length;i++){
            line[i] = String.valueOf(i);
        }
        System.out.println("New array "+ Arrays.toString(line));
    }
}
