package shubham;

public class binary {
    public static void main(String[] args) {
        int ans = solutionBinary(1000);
        int ans1 = solution(1000);
        System.out.println(ans1);
        System.out.println(ans);
    }

    public static int solution(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        int n1 = (n % 2 == 1) ? 1 : 0;
        int n2 = n / 2;
        int diff = Math.abs(n2 - n1);
        int i, j;
        for (i = n1 + 2, j = n2 - 1; i < n; i += 2, j--) {
            int loopDiff = Math.abs(j - i);
            if (loopDiff < diff)
                diff = loopDiff;
            else {
                n1 = i - 2;
                n2 = j + 1;
                break;
            }
        }

        return (n1 + n2);
    }

    public static int solutionBinary(int n) {

        int start = 0, end = n;
        int Diff = Integer.MAX_VALUE;
        int pn2 = -1, pn1 = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int n2 = mid / 2;
            int n1 = n - (2 * n2);
            int diff = Math.abs(n2 - n1);

            if (diff < Diff) {
                Diff = diff;
                pn2 = n2;
                pn1 = n1;
                if (n1 > n2) {
                    start = mid + 1;
                } else if (n1 < n2) {
                    end = mid - 1;
                }
            } else {
                break;
            }
        }
        return (pn1 + pn2);
    }
}
