package BasicPart_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class problem_92 {
    public static void main(String[] args) {
        int num,even=0,odd = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the length of array");
        num = scanner.nextInt();
        int[] array = new int[num];
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(1000);
        }
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Array is \n"+ Arrays.toString(array));
        System.out.println("Total Even "+even);
        System.out.println("Total Odd is "+odd);

    }

}
