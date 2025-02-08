package BasicPart_1;

import java.util.Scanner;

public class Problem_57 {
    public static void main(String[] args) {
        int x;
        int count =0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        for (int i =1;i<=x;i++){
            if (x%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
