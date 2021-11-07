package shubham;

public class try1 {

    public static void main(String[] args) {
        System.out.println(fun5(10));
    }

    public static void fun(int n) {
        int i = 0;
        if (n > 1)
            fun(n - 1);
        for (i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void fun2(int n) {
        if (n <= 0)
            return;
        if (n > 1000)
            return;

        System.out.printf(String.format("%d", n));
        fun2(2 * n);
        System.out.printf(String.format("%d", n));

    }

    public static void fun3(int n) {
        if (n > 0) {
            fun3(--n);
            System.out.print(n + " ");
            fun3(--n);
        }
    }

    public static int fun4(int n) {
        if (n % 2 == 1)
            return n++;
        else
            return fun4(fun4(n - 1));
    }

    public static int fun(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0)
            return fun(a * a, b / 2);

        return fun(a * a, b / 2) * a;
    }

    public static int fun5(int n) {
        if (n > 100)
            return n - 10;

        return fun5(fun5(n + 11));
    }
}
