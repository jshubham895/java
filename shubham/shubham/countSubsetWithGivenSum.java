package shubham;

public class countSubsetWithGivenSum {

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 6, 8, 10 };
        int sum = 10;
        System.out.println(countSubsets(a, sum));
    }

    private static int countSubsets(int[] a, int sum) {

        int[][] t = new int[a.length + 1][sum + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0)
                    t[i][j] = 0;
                if (j == 0)
                    t[i][j] = 1;
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (a[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - a[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[a.length][sum];
    }
}
