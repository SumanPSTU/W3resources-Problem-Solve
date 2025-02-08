package BasicPart_1;

import java.util.Scanner;

public class problem_84 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a string ");
            s = scanner.nextLine();
        }while (s.length()<3);
        System.out.println(s.substring(s.length()-3)+s+s.substring(s.length()-3));

    }
}
