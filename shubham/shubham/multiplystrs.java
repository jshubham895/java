package shubham;

public class multiplystrs {
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        System.out.println(multiply(num1, num2));
        System.out.println(Double.MAX_VALUE);
    }

    public static String multiply(String num1, String num2) {
        double n1 = strToInt(num1);
        double n2 = strToInt(num2);
        double result = n1 * n2;
        String res = new String(String.valueOf(result));
        return res;
    }

    public static double strToInt(String s) {
        char[] ch = s.toCharArray();
        double num = 0;
        for (char c : ch) {
            num = num * 10 + (c - 48);
        }
        return num;
    }
}
