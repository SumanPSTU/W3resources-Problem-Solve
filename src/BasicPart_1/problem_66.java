package BasicPart_1;

public class problem_66 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =2;i<=100;i++){
            if (isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num){
        for (int i = 2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
