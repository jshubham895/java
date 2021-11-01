package shubham;

import java.util.ArrayList;

class fibonacci {

    public static void main(String[] args) {
        // System.out.println(fib(5, new ArrayList<Integer>()));
        System.out.println(fib(5));
    }

    private static ArrayList<Integer> fib(int n, ArrayList<Integer> list) {

        if (n == 0)
            return list;

        fib(n - 1, list);
        list.add(n);

        return list;
    }

    private static ArrayList<Integer> fib(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        if (n == 0)
            return list;

        list.add(n);
        ArrayList<Integer> aFB = fib(n - 1);
        list.addAll(aFB);

        return list;
    }

}