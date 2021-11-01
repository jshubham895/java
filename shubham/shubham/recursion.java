package shubham;

public class recursion {
    public static void main(String[] args) {
        int a = 14;
        System.out.println(numberOfSteps(a));
    }

    public static int numberOfSteps(int num) {

        return helper(num, 0);

    }

    private static int helper(int n, int c) {

        if (n == 0)
            return c;

        int rem = n % 2;
        if (rem == 0)
            return helper(n / 2, c + 1);
        return helper(n - 1, c + 1);
    }
}
