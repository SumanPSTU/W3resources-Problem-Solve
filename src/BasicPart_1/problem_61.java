package BasicPart_1;

import java.util.Scanner;

public class problem_61 {
    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        word = scanner.next();
        char[] c = word.toCharArray();
        for (int i = c.length-1; i>=0; i--) {
            System.out.print(c[i]);
        }
    }
}
