package BasicPart_1;

import java.util.Scanner;
public class problem_108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(add(num));
    }
    public static int add(int num){
        int r = 0;
        int sum =0;

        while (num!=0){
            r = num%10;
            sum += r;
            num = num/10;
        }
        return sum;
    }
}