package BasicPart_1;

public class problem_101 {
    public static void main(String[] args) {
        int count10 = 0;
        int count20 = 0;
        int[] arrayOne = {10, 11, 10, 30, 45, 20, 33, 53};
        for (int i =0;i<arrayOne.length;i++){
            if (arrayOne[i] == 10){
                count10++;
            }
            if (arrayOne[i] ==20){
                count20++;
            }
        }
        String con = count10>count20?"true":"flase";
        System.out.println(con);
    }
}
