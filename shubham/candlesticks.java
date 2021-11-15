package shubham;

public class candlesticks {

    public static void main(String[] args) {
        int[] a = { 2, 80, 4, 32 };
        int result = totalPairs(a.length, a);
        System.out.println(result);
    }

    static int totalPairs(int n, int[] values) {

        if (values.length == 2) {
            return 1;
        }

        int pairs = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = i + 1; j < n; j++) {
                int min = Math.min(values[i], values[j]);
                if (max >= values[i])
                    break;
                if (min <= max) {
                    continue;
                }
                pairs++;
                max = Math.max(max, values[j]);
            }
        }
        return pairs;
    }
}
