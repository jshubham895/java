package coding;

public class binary {
    public static void main(String[] args) {
        run();
        System.out.println(run(100));
        System.out.println(run("run"));
        System.out.println(run(false));
        add(1, 2);
        System.out.println(add(12.0, 15.0));
    }

    public static void run() {
        System.out.println("Running");
    }

    public static int run(int var) {
        return var;
    }

    public static String run(String run) {
        return "false";
    }

    public static boolean run(boolean value) {
        return false;
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static int add(int a, int b, int c) {
        c = a + b;
        return c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

}
