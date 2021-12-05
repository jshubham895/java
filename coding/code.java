package coding;

public class code {

    public static void main(String[] args) {
        String str = "0sdg#$AfDskGG";
        String res = decrypt(str);
        System.out.println(res);
    }

    public static String decrypt(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                res += str.charAt(i);
            }
        }

        return res;
    }
}
