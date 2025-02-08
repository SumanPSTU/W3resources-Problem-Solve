package BasicPart_1;

import java.util.Scanner;

public class problem_52 {
    public static void main(String[] args){
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three integer");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (x+y==z){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
