package shubham;

import java.util.ArrayList;

public class rootToLeaf {
    public static void main(String[] args) {

        TreeNode head = new TreeNode(0);
        // head.right = new TreeNode(3);
        head.left = new TreeNode(1);
        // head.left.left = new TreeNode(5);
        // head.left.right = new TreeNode(1);

        System.out.println(printPaths(head));
    }

    static int printPaths(TreeNode head) {
        int[] path = new int[1000];
        helper(head, path, 0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    static ArrayList<Integer> list = new ArrayList<>();

    private static void helper(TreeNode head, int[] path, int pathLen) {

        if (head == null)
            return;

        int num = 0;
        path[pathLen] = head.val;
        pathLen++;

        if (head.left == null && head.right == null) {
            num = makeNum(path, pathLen);
            list.add(num);

        } else {
            helper(head.left, path, pathLen);
            helper(head.right, path, pathLen);
        }

    }

    static void printArray(int[] a, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    static int makeNum(int[] a, int len) {
        int n = len - 1;
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (n >= 0) {
                num = num + a[i] * (int) Math.pow(10, n);
                n--;
            }
        }
        return num;
    }

}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
