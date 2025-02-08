package BasicPart_1;

import java.util.Scanner;

public class problem_54 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (Test(x,y,z)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public static boolean Test(int x, int y,int z){
        if (x % 10 ==y % 10||y % 10 ==z % 10||z % 10 ==x % 10){
            return true;
        }else {
            return false;
        }
    }
}
