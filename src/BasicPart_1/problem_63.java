package BasicPart_1;

import java.util.Scanner;

public class problem_63 {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(Test(x,y));

    }
    public static int Test(int x, int y){
        if (x==y){
            return 0;
        }
        if (x%6==y%6){
            return (x<y)?x:y;
        }
        return (x>y)?x:y;
    }
}
