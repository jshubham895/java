package shubham;

import java.util.*;

public class trees {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty())
            return ans;
        String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ans.add("");
        while (ans.peek().length() != digits.length()) {
            System.out.println(ans.peek().length());
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char c : map.toCharArray()) {
                ans.addLast(remove + c);
            }
        }
        return ans;
    }
}