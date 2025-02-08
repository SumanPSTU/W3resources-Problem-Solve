package ConditionalStatement;
import java.util.Scanner;
public class problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Input three number: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("Maximum value is "+max(a,b,c));
    }
    static int max(int a,int b, int c){
        return Math.max(Math.max(a,b),c);
    }
}
