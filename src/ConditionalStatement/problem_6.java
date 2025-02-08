package ConditionalStatement;
import java.util.Scanner;
public class problem_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        if ((int) a*1000 == (int) b*1000){
            System.out.println("Number's are same");
        }else {
            System.out.println("Number's are not same");
        }

    }
}
