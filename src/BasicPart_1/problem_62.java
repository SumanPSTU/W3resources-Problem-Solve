package BasicPart_1;

import java.util.Scanner;

public class problem_62 {
    public static void main(String[] args) {
        int x=20,y,z;
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (Test(x,y,z)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public static  boolean Test(int x,int y,int z){
        if (Math.abs(y-z) >x || Math.abs(z-y)>x){
            return true;
        }else {
            return false;
        }
    }
}
