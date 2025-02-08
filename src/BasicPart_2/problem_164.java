package BasicPart_2;

import java.util.Scanner;

public class problem_164 {
    public static void main(String[] args) {
        double divident,divider;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        divident = scanner.nextDouble();
        System.out.print("Input the divider: ");
        divider = scanner.nextDouble();
        double result = 0;
        while (divident>divider){
            divident -=divider;
            result++;
        }
        double decimalpart =(float) divident / (float) divider;
        System.out.println("Result "+(result+decimalpart));
    }
}
