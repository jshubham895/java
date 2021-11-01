package shubham;

import java.util.*;

public class SolutionClass {

    public static void findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output,
            int index) {
        if (index == nums.size()) {
            subset.add(output);
            return;
        }
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
        output.add(nums.get(index));
        findSubsets(subset, nums, new ArrayList<>(output), index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        List<List<Integer>> subset = new ArrayList<>();
        for (int i = 0; i < n; i++)
            input.add(sc.nextInt());

        sc.close();

        findSubsets(subset, input, new ArrayList<>(), 0);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < subset.size(); i++) {
            int mul = 1;
            for (int j = 0; j < subset.get(i).size(); j++) {
                mul *= subset.get(i).get(j);
            }
            if (mul < 0) {
                ans.add(subset.get(i));
            }

        }

        System.out.println(ans);
    }
}
