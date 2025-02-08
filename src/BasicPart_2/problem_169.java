package BasicPart_2;
public class problem_169 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original String\n"+s);
        String[] strings = s.split(" ");
        for (int i=strings.length-1;i>=0;i--){
            stringBuilder.append(strings[i]).append(" ");
        }
        System.out.println("reverse string\n"+stringBuilder.toString().trim());
    }
}
