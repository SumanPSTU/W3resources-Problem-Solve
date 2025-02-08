package BasicPart_1;

import java.util.Scanner;

public class problem_56 {
    public static void main(String[] args) {
        int x,y,p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range (x,y)");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Enter divider number");
        p = scanner.nextInt();
        for (int i = x;i<=y;i++){
            if (i%p==0){
                System.out.print(i+" ");
            }
        }
    }
}
