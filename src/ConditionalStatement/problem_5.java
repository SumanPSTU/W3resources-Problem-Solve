package ConditionalStatement;

import java.util.Scanner;

public class problem_5 {
    public static void main(String[] args) {
        String dayName;
        System.out.println("Enter a number between 1 - 7");
        int n = new Scanner(System.in).nextInt();
        switch (n){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        System.out.println(dayName);
    }
}
