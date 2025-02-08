package Recursion;

import java.util.Scanner;

public class problem_4 {
    static boolean isPalindromic(String str){
        if (str.length()<=1) return true;
        if (str.charAt(0)!=str.charAt(str.length()-1)) return false;
        String remainString = str.substring(1,str.length()-1);
        return isPalindromic(remainString);
    }
    public static void main(String[] args) {
        System.out.println("Enter a line to check: ");
        String str = new Scanner(System.in).nextLine();
        System.out.println("this line is palindromic: "+isPalindromic(str));
    }
}
