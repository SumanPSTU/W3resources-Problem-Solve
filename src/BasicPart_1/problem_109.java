package BasicPart_1;

import java.util.Scanner;

public class problem_109 {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();

        if (n > 0) {
            double sqrtResult = Math.sqrt(8 * (long) n + 1);
            int numRows = (int) ((sqrtResult - 1) / 2);
            System.out.println("Number of rows: " + numRows);
        }
        in.close();
    }
}
