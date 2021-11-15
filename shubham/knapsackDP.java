package shubham;

public class knapsackDP {
    public static void main(String[] args) {
        int[] weight = { 1, 3, 4, 5 };
        int[] value = { 1, 4, 5, 7 };
        int totalWeight = 7;
        int n = weight.length;
        System.out.println(knapsackDPsol(weight, value, totalWeight, n));
    }

    private static int knapsackDPsol(int[] weight, int[] value, int w, int n) {
        int[][] dp = new int[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (weight[i - 1] <= j) {
                    dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][w];
    }
}
