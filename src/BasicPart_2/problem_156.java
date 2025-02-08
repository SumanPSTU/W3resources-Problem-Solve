package BasicPart_2;
public class problem_156 {
    public static void main(String[] args) {
        int n = 2350;
        System.out.println("Result: "+logBase2(n));
    }
    static int logBase2 (int n){
        if (n<=0){
            throw new IllegalArgumentException();
        }
        return (int)(Math.log(n)/Math.log(2));
    }
}