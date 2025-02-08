package BasicPart_2;
import java.util.Scanner;
public class problem_168 {
    public static void main(String[] args) {
        int a,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = scanner.nextInt();
        System.out.print("Enter the second number : ");
        n = scanner.nextInt();
        scanner.close();
        int result =1;
        for (int i = 0; i < n; i++) {
            result+=a;
        }
        System.out.println("Result of "+a+" X "+n+" = "+result);
    }
}
