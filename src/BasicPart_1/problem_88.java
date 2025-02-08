package BasicPart_1;

public class problem_88 {
    public static void main(String[] args) {
        System.out.println("Current system environment:");
        System.out.println(System.getenv());

        System.out.println("Current system properties:");
        System.getProperties().forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
