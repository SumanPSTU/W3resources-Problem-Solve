package BasicPart_1;

import java.util.Scanner;
public class problem_72 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        if (s.length()>=3){
            System.out.println(s.substring(0,3));
        }else if(s.length()==1){
            System.out.println(s.charAt(0)+"##");
        }else{
            System.out.println("###");
        }
    }
}
