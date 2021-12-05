package shubham;

public class robber {
    public static void main(String[] args) {
        int[] a = { 2, 7, 9, 3, 1 };
        int ans = rob(a);
        System.out.println(ans);
    }

    private static int rob(int[] nums) {
        int prevNo = 0;
        int prevYes = 0;

        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }

        return Math.max(prevNo, prevYes);
    }
}
