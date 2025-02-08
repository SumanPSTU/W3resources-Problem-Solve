package ConditionalStatement;
import java.util.Scanner;
public class problem_9 {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        int y = new Scanner(System.in).nextInt();
        if (y%100!=0 && (y%400==0||y%4==0)){
            System.out.println("It's a leap year");
        }else {
            System.out.print("It's not a leap year");
        }
    }
}
