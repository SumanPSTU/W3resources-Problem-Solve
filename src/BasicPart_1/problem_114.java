package BasicPart_1;

import java.util.Scanner;

public class problem_114 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        str = scanner.nextLine();
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        scanner.close();
        char[] chars = str.toCharArray();
        char[] ofset = new char[n];
        for (int i = 0;i<n;i++){
            ofset[i] = chars[i];
        }
        for (int i =0;i<chars.length-n;i++){
            chars[i] = chars[i+n];
        }
        for (int i =0;i<n;i++){
            int index=chars.length-n;
            chars[index+i] = ofset[i];
        }
        System.out.println(String.valueOf(chars));


    }
}
