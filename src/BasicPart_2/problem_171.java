package BasicPart_2;
import java.util.Scanner;
public class problem_171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("First string :  "+s1);
        System.out.println("Second string :  "+s2);
        System.out.println("s2 contains s1: "+ifContains(s1,s2));
    }
    static boolean ifContains(String s1, String s2){
        if (s2.contains(s1)){
            return true;
        }
        return false;
    }
}
