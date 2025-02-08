package BasicPart_1;

public class problem_136 {
    public static int unique_Paths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] grid = new int[m][n];
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                grid[i][j] = get_Paths(grid, i, j);
            }
        }
        return grid[0][0];
    }
    private static int get_Paths(int[][] grid, int i, int j) {
        if (i >= grid.length - 1 || j >= grid[0].length - 1) {
            return 1;
        }
        return grid[i][j + 1] + grid[i + 1][j];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println("Unique paths from top-left\ncorner to bottom-right corner\nof the said grid: "+unique_Paths(m, n));
    }
}
