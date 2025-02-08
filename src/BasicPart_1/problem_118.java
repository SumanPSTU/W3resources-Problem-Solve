package BasicPart_1;

import java.util.Scanner;

public class problem_118 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        str = scanner.nextLine();
        System.out.println("Enter the substring");
        String sub = scanner.next();
        findIndex(str,sub);
    }
    public static void findIndex(String str,String sub){
        if (str.contains(sub)){
            System.out.println(str.indexOf(sub));
        }
        else {
            System.out.println("Substring not found");
        }
    }
}
