package shubham;

public class reverseInteger {

    public static void main(String[] args) {
        int x = -1240;
        int ans = reverse(x);
        System.out.println(ans);
    }

    private static int reverse(int x) {

        long num = x;
        long rev = reverseLong(num);

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;

        return (int) rev;
    }

    private static long reverseLong(long num) {

        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }
}
