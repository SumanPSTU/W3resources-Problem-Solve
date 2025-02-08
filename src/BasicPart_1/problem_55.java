package BasicPart_1;

import java.util.Scanner;

public class problem_55 {
    public static void main(String[] args) {
        int seconds, minutes, hours;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds:");
        seconds = scanner.nextInt();

        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + "h: " + minutes + "m: " + seconds + "s");

        scanner.close();

    }
}
