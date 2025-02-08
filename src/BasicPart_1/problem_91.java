package BasicPart_1;

public class problem_91 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println("First 20 natural numbers are");
        for (int i=1;i<=20;i++){
            System.out.print(i+" ");
        }
        long estTime = System.nanoTime()-startTime;
        System.out.println("\nEstimated time (in nanoseconds) to get \nthe first 20 natural numbers: " + estTime);

    }
}
