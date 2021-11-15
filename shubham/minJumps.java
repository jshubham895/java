package shubham;

public class minJumps {
    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 1, 4 };
        System.out.println(jump(a));
    }

    public static int jump(int[] A) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            curFarthest = Math.max(curFarthest, i + A[i]);
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}
