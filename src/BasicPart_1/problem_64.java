package BasicPart_1;

import java.util.Scanner;

public class problem_64 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number between 25 to 75");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(Test(x,y));
    }
    public static boolean Test(int x, int y){
        if (x%10==y%10 || x/10 == y/10){
            return true;
        }else {
            return false;
        }

    }
}
