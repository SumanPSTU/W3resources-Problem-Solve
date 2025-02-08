package ConditionalStatement;

import java.util.Scanner;
public class problem_8 {
    public static void main(String[] args){
        System.out.print("Enter a character: ");
        String  c = new Scanner(System.in).nextLine().toUpperCase();
        boolean vowel = c.charAt(0)=='a' || c.charAt(0) == 'e' || c.charAt(0) == 'i'
                || c.charAt(0) =='o'||c.charAt(0)=='u';
        boolean uppercase = c.charAt(0)>=65 && c.charAt(0)<=90;
        boolean lowercase = c.charAt(0)>=122 && c.charAt(0)<=97;
        if (c.length()>1){
            System.out.println("Input a single character");
        }
        else if (vowel){
            System.out.println("Character is a vowel!");
        }else if (!uppercase && !lowercase){
            System.out.println("Enter a valid character");
        }else {
            System.out.println("character is a consonant");
        }
    }
}
