package shubham;

import java.util.*;

public class subarraySumEqualsK {

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 4, 0 };
        int ans = bestRotation(a);
        System.out.println(ans);
    }

    private static int subarraySumK(int[] a, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for (int a : A) {
            sum = (sum + a) % K;
            if (sum < 0)
                sum += K; // Because -1 % 5 = -1, but we need the positive mod 4
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int bestRotation(int[] A) {
        int N = A.length;
        int change[] = new int[N];
        for (int i = 0; i < N; ++i) {
            int t = (i - A[i] + 1 + N) % N;
            change[t] -= 1;
        }
        int max_i = 0;
        for (int i = 1; i < N; ++i) {
            change[i] += change[i - 1] + 1;
            max_i = change[i] > change[max_i] ? i : max_i;
        }
        return max_i;
    }

}
