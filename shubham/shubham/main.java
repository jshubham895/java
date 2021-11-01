package shubham;

import java.util.*;

class Main {

    public static void main(String[] args) {
        int[] weight = { 1, 3, 4, 5 };
        int[] value = { 1, 4, 5, 7 };
        int totalWeight = 7;
        int n = weight.length;
        System.out.println(knapsack(weight, value, totalWeight, n));

    }

    private static int knapsack(int[] weight, int[] value, int totalWeight, int n) {
        int[][] dp = new int[n + 1][totalWeight + 1];

        for (int[] r : dp) {
            Arrays.fill(r, -1);
        }

        return knapsackRec(weight, value, totalWeight, n, dp);
    }

    private static int knapsackRec(int[] weight, int[] value, int totalWeight, int n, int[][] dp) {
        if (n == 0 || totalWeight == 0)
            return 0;

        if (dp[n][totalWeight] != -1)
            return dp[n][totalWeight];

        if (weight[n - 1] <= totalWeight)
            return dp[n][totalWeight] = Math.max(
                    value[n - 1] + knapsack(weight, value, totalWeight - weight[n - 1], n - 1),
                    knapsack(weight, value, totalWeight, n - 1));
        else
            return dp[n][totalWeight] = knapsack(weight, value, totalWeight, n - 1);

    }

}