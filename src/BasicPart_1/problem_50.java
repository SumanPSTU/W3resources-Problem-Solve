package BasicPart_1;

public class problem_50 {
    public static void main(String[] args) {

        // divided by 3
        System.out.println("Devided by 3");
        for (int x = 0; x < 100; x++) {
            if (x % 3 == 0) {
                System.out.print(x+" ");
            }
        }

        //divided by 5
        System.out.println("\nDevided by 5");
        for (int x = 0; x < 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x+" ");
            }
        }
        // divided by 3 and 5
        System.out.println("\nDevided by 3 and 5");
        for (int x = 0; x < 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print(x+" ");
            }
        }
    }
}
