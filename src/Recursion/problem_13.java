package Recursion;
public class problem_13 {
    public static int calculateProduct(int[] arr) {
        return calculateProduct(arr, 0, arr.length - 1);
    }

    private static int calculateProduct(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int productLeft = calculateProduct(arr, left, mid);
        int productRight = calculateProduct(arr, mid + 1, right);

        return productLeft * productRight;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,7};
        int product = calculateProduct(array);
        System.out.println("The product of all numbers in the array is: " + product);
    }
}
