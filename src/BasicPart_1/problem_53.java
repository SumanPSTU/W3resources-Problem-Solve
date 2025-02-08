package BasicPart_1;

import java.util.Scanner;

public class problem_53 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (test(x,y,z)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
    public static boolean test(int x,int y, int z){
        if (x<y && y<z){
            return true;
        }else {
            return false;
        }
    }
}
