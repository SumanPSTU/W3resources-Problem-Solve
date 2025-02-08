package BasicPart_1;

import java.util.Scanner;

public class problem_87 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("sum of the digit is ");
        System.out.println(DigitSum(n));
    }
    public static String DigitSum(int num){
        int sum = 0;
        while (num!=0){
            sum+=num%10;
            num/=10;
        }
        return DigitToEnglish(sum);
    }
    public static String DigitToEnglish(int n){
        String[] unique = { "", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};

        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if (n<20){
            return unique[n];
        }
        if (n<100){
            return tens[n/10]+(n%10!=0?" ":"")+unique[n%10];
        }
        if (n<1000){
            return unique[n/100]+" hundred"+(n%10!=0?" ":"")+DigitToEnglish(n%100);
        }
        if (n<10000){
            return unique[n/1000]+" thousand "+DigitToEnglish(n%1000);
        }
        return "";
    }
}