package BasicPart_2;
import java.util.Scanner;
public class problem_153 {
    public static void main(String[] args) {
        double a , b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two double number");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        if (a<1 && a >0 && b < 1 && b > 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
