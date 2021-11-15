package shubham;

import java.util.Arrays;
import java.util.Comparator;

public class bankWinner {

    public static void main(String[] args) {
        String s = "1";
        System.out.println(winner(s));
    }

    private static String winner(String s) {

        String[] splited = s.split("1");

        if (splited.length == 0 && s.equals("1"))
            return "A";
        else if (splited.length == 0 && s.equals("0"))
            return "B";

        if (splited.length == 1 && splited[0].length() == 0) {
            return "A";
        }

        String longest = Arrays.stream(splited).max(Comparator.comparingInt(String::length)).get();

        if (longest.length() % 2 == 1)
            return "A";
        else
            return "B";
    }
}