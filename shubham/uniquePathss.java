package shubham;

public class uniquePathss {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int ans = uniquePaths(m, n);
        System.out.println(ans);

    }

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[j] = j < 1 ? 1 : (dp[j - 1] + dp[j]);
            }
        }
        return dp[n - 1];
    }

    // Memoized
    private static int helper(int m, int n, int[][] memo) {
        if (m < 0 || n < 0)
            return 0;
        else if (m == 0 || n == 0)
            return 1;
        else if (memo[m][n] > 0)
            return memo[m][n];
        else {
            memo[m][n] = helper(m - 1, n, memo) + helper(m, n - 1, memo);
            return memo[m][n];
        }
    }

    // Recursive
    private static int helper(int m, int n) {

        if (m < 0 || n < 0)
            return 0;
        else if (m == 0 || n == 0)
            return 1;
        else
            return helper(m - 1, n) + helper(m, n - 1);

    }
}