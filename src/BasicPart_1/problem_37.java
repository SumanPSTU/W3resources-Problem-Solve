package BasicPart_1;

import java.util.Arrays;

public class problem_37 {
    public static void main(String[] args) {
       String line = "This is a string";
       char[] character = line.toCharArray();
        int len = character.length;
        for(int i =0; i<len/2;i++){
            char temp = character[i];
            character[i]= character[len-i-1];
            character[len-i-1]= temp;
        }
        System.out.print(Arrays.toString(character));

    }
}