package shubham;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        List<List<Integer>> subset = new ArrayList<>();

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        findSubsets(subset, input, new ArrayList<>(), 0);

        System.out.println(subset);
    }

    private static void findSubsets(List<List<Integer>> subset, ArrayList<Integer> input, ArrayList<Integer> output,
            int index) {
        if (index == input.size()) {
            subset.add(output);
            return;
        }

        findSubsets(subset, input, new ArrayList<>(output), index + 1);
        output.add(input.get(index));
        findSubsets(subset, input, new ArrayList<>(output), index + 1);
    }
}