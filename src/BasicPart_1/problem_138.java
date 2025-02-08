package BasicPart_1;

import java.util.*;

public class problem_138 {
    static ArrayList longestWords(String[] dictionary) {
        ArrayList list = new ArrayList();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] dict = {"cat", "dog", "red", "is", "am"};
        System.out.println("Original dictionary: " + Arrays.toString(dict));
        System.out.println("Longest word(s) of the above dictionary: " + longestWords(dict));
    }
}
