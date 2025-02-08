package BasicPart_1;

import java.util.Scanner;

public class problem_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String word="";
        line = scanner.nextLine();
        String[] arr = line.split(" ");
        for (String i:arr){
            if (!i.isEmpty()){
                String c = i.substring(0,1).toUpperCase()+i.substring(1);
                word+= c+" ";
            }
        }
        char[] s = word.toCharArray();
        for (int i = 0; i < s.length-1; i++) {
            System.out.print(s[i]);
        }

    }
}