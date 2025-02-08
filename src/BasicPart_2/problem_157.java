package BasicPart_2;
import java.util.Scanner;
public class problem_157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of those number is "+GCD(a,b));
    }
    static int GCD(int x,int y){
        if (x==0 || y ==0){
            return 1;
        }
        if (x<y){
            int temp = x;
            x = y;
            y = temp;
        }
        if (x%y==0){
            return y;
        }else {
            return GCD(y,x%y);
        }
    }
}
