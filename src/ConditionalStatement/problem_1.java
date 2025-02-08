package ConditionalStatement;
import java.util.Scanner;
public class problem_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if (n >0){
            System.out.println("Number is positive");
        }else if (n==0){
            System.out.println("number is zero");
        }else {
            System.out.println("Number is negative");
        }
    }
}
