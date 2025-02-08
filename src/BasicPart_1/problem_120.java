package BasicPart_1;

import java.util.Scanner;

public class problem_120 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter a target value:");
        int target = scanner.nextInt();
        scanner.close();
        boolean found = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Target value found at index: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Target value not found in the matrix.");
        }
    }
}
