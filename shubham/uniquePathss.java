package shubham;

public class uniquePathss {
    public static void main(String[] args) {
        int m = 3, n = 7;
        int ans = uniquePaths(m, n);
        System.out.println(ans);

    }

    public static int uniquePaths(int m, int n) {
        return helper(m - 1, n - 1);
    }

    private static int helper(int m, int n) {

        if (m < 0 || n < 0)
            return 0;
        else if (m == 0 || n == 0)
            return 1;
        else
            return helper(m - 1, n) + helper(m, n - 1);

    }
}