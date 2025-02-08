package BasicPart_2;
import java.util.Scanner;

public class problem_152 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integer");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if (a==b && b==c && c==d && a==d){
            System.out.println("Numbers are equal");
        }else {
            System.out.println("Numbers are not equal");
        }
    }
}
