package shubham;

import java.util.Arrays;

public class mulTable {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int k = 5;
        int ans = findKthNumber(m, n, k);
        System.out.println(ans);
    }

    public static int findKthNumber(int m, int n, int k) {
        int[] res = new int[m * n];
        int idx = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                res[idx++] = i * j;
            }
        }

        Arrays.sort(res);
        return res[k - 1];
    }
}

// 1 2 3 4 5
// 2 4 6 8 10
// 3 6 9 12 15
// 4 8 12 16 20
// 5 10 15 20 25
