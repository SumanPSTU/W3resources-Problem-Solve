package BasicPart_1;

import java.util.Scanner;
public class problem_65 {
    public static void main(String[] args) {
        int rem = 0;
        int multi =0;
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if (x>y){
            rem = x/y;
            multi = rem*y;
            System.out.println(x-multi);
        }else {
            rem = y/x;
            multi = rem*x;
            System.out.println(y-multi);
        }
    }
}
