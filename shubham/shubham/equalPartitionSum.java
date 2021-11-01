package shubham;

import java.util.Arrays;

public class equalPartitionSum {
    public static void main(String[] args) {
        int[] a = { 1, 5, 11, 5 };
        System.out.println(checkEqualSum(a));
    }

    public static boolean checkEqualSum(int[] a) {
        int sum = Arrays.stream(a).sum();

        if (sum % 2 == 1)
            return false;
        else
            return subsetSum.checkSum(a, sum / 2);
    }
}
