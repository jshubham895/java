package shubham;

import java.util.ArrayList;
import java.util.List;

public class arraylistExample {

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> res = findDisappearedNumbers(nums);
        System.out.println(res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[nums[i] - 1]++;
        }

        for (int i = 1; i < n; i++) {
            if (freq[i] == 0)
                list.add(i + 1);
        }

        return list;

    }

}
