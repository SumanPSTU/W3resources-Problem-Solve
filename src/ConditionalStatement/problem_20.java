package ConditionalStatement;

public class problem_20 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <=i+1 ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}
