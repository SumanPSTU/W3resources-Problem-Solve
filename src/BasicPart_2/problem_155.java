package BasicPart_2;
public class problem_155 {
    public static void main(String[] args) {
        int[][] twodm = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.println("Original array");
        printArray(twodm);
        System.out.println("Changing array");
        transpose(twodm);
    }
    static void transpose(int arr[][]){
        int[][] newArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArray[i][j] = arr[j][i];
            }
        }
        printArray(newArray);
    }
    static void printArray(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
