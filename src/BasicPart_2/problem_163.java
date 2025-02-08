package BasicPart_2;
import java.util.Scanner;
public class problem_163 {
    public static void main(String[] args) {
        int n,count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = scanner.nextInt();
        scanner.close();
        String string = Integer.toBinaryString(n);
        System.out.println("Binary representation of "+n+" is "+string);
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='0'){
                count++;
            }
        }
        System.out.print("Number of zero bits: " +count);
    }
}
