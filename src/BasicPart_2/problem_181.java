package BasicPart_2;

public class problem_181 {
    public static void main(String[] args) {
        String str = " The length of last word";
        String[] split = str.split("\\s+");
        System.out.println("Last word length is "+split[split.length-1].length());
    }
}
