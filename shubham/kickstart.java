package shubham;

import java.util.*;

public class kickstart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            helper(n, d, c, m, s, i);
        }
        sc.close();
    }

    private static void helper(int n, int d, int c, int m, String s, int t) {
        int dog = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D')
                dog++;
        }
        for (int i = 0; i < n; i++) {
            if (dog == 0) {
                System.out.println("Case #" + t + ": YES");
                return;
            }
            if (s.charAt(i) == 'D' && d > 0) {
                dog--;
                d--;
                c += m;
            } else if (s.charAt(i) == 'C' && c > 0) {
                c--;
            } else {
                System.out.println("Case #" + t + ": NO");
                return;
            }
        }
        System.out.println("Case #" + t + ": YES");
    }
}