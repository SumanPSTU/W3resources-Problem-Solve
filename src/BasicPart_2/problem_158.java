package BasicPart_2;
public class problem_158 {
    public static void main(String[] args) {
        int n =3;
        int[][] array = new int[n] [n];
        for (int i = 0; i < array.length; i++) {
            for (int j =0;j < array.length;j++){
                if (primeCheck(i,j,n)){
                    System.out.print(primeCheck(i,j,n)+" ");
                }else {
                    System.out.print(primeCheck(i,j,n)+" ");
                }
            }
            System.out.println();
        }

    }
    static boolean primeCheck(int x,int y,int n){
        for (int i = 2; i < n; i++) {
            if (x%i==0 && y%i==0 && (x>1 && y>1)){
                return true;
            }
        }
        return false;
    }
}
