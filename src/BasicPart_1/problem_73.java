package BasicPart_1;

import java.util.Scanner;

public class problem_73 {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        if (s1.length()>=1 && s2.length()>=1){
            System.out.println(s1.substring(0,1)+s2.substring(s2.length()-2,s2.length()-1));
        }else if(s1.length()==0 && s2.length()>=1){
            System.out.println("#"+s2.substring(s2.length()-2,s2.length()-1));
        }else {
            System.out.println(s1.substring(0,1)+"#");
        }
    }
}
