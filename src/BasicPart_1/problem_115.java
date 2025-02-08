package BasicPart_1;

import java.util.Scanner;
public class problem_115 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        n = scanner.nextInt();
        scanner.close();
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        System.out.println(check(arr));
    }
    public static boolean check(char[] arr){
        for (int i =0;i<arr.length/2;i++){
            if (arr[i] == arr[arr.length-i-1]){
                return  true;
            }
        }
        return false;
    }
}
