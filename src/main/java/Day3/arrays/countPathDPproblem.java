package Day3.arrays;
import java.util.Arrays;
public class countPathDPproblem {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return countPaths(0, 0, m, n, dp);
    }

    public int countPaths(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 && j == n - 1) return 1;
        if (i >= m || j >= n) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        else return dp[i][j] = countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);
    }

    public static void main(String[] args){
        System.out.println(new countPathDPproblem().uniquePaths(3,3));
    }

}
