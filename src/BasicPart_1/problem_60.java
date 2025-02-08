package BasicPart_1;

import java.util.Scanner;

public class problem_60 {
    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);
        line = scanner.nextLine();
        String[] word = line.split(" ");
        System.out.println(word[word.length-2].length());
    }
}
