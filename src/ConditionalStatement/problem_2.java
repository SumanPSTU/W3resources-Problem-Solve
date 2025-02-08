package ConditionalStatement;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        c = scanner.nextDouble();
        double D = ((b*b)-(4*a*c));
        if (D>0.0){
            double r1 = (- b+Math.sqrt(D))/2*a;
            double r2 = (- b-Math.sqrt(D))/2*a;
            System.out.println("The roots are "+r1+" and "+r2);
        }else if (D==0){
            System.out.println("The root is "+ ((-b)/2*a));
        }else {
            System.out.println("The equation has no real roots.");
        }


    }
}
