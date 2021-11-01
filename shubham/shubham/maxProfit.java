package shubham;

import java.util.*;

public class maxProfit {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        Collections.addAll(a, 12, 21, 102);
        List<Integer> b = new ArrayList<>();
        Collections.addAll(b, 167, 244, 377, 56, 235, 269, 23);
        int maxSum = 3696;
        System.out.println(maxCount(a, b, maxSum));
    }

    private static int maxCount(List<Integer> a, List<Integer> b, int maxSum) {

        int idx1 = 0, idx2 = 0, currSum = 0, count = 0;

        while (currSum <= maxSum && idx1 < a.size() && idx2 < b.size()) {
            if (a.get(idx1) <= b.get(idx2)) {
                currSum += a.get(idx1);
                idx1++;
            } else if (a.get(idx1) > b.get(idx2)) {
                currSum += b.get(idx2);
                idx2++;
            }
            if (currSum <= maxSum)
                count++;
        }

        while (currSum <= maxSum && idx1 < a.size()) {
            currSum += a.get(idx1);
            idx1++;
            if (currSum <= maxSum)
                count++;
        }

        while (currSum <= maxSum && idx2 < b.size()) {
            currSum += b.get(idx2);
            idx2++;
            if (currSum <= maxSum)
                count++;
        }

        return count;
    }

}
