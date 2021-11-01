package shubham;

public class knapsack {

    public static void main(String[] args) {
        int[] weight = { 1, 3, 4, 5 };
        int[] value = { 1, 4, 5, 7 };
        int totalWeight = 7;
        int n = weight.length;
        System.out.println(knapsackRecursive(weight, value, totalWeight, n));
    }

    private static int knapsackRecursive(int[] weight, int[] value, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (weight[n - 1] <= w) {
            return Math.max(value[n - 1] + knapsackRecursive(weight, value, w - weight[n - 1], n - 1),
                    knapsackRecursive(weight, value, w, n - 1));
        } else {
            return knapsackRecursive(weight, value, w, n - 1);
        }
    }
}
