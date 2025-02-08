package BasicPart_1;

import java.util.Scanner;

public class problem_86 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n!=1){
            if (n%2==0){
                n = n/2;
            }else {
                n = ((n*3)+1)/2;
            }
        }
        System.out.println("final value of n is "+n);
    }
}
