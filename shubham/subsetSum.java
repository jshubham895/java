package shubham;

public class subsetSum {

    public static void main(String[] args) {
        int[] a = { 2, 3, 7, 8, 10 };
        int sum = 11;
        System.out.println(checkSum(a, sum));
    }

    public static boolean checkSum(int[] a, int sum) {

        boolean[][] t = new boolean[a.length + 1][sum + 1];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == 0)
                    t[i][j] = false;
                if (j == 0)
                    t[i][j] = true;
            }
        }

        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (a[i - 1] <= j) {
                    t[i][j] = t[i][j - a[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[a.length][sum];
    }

}
