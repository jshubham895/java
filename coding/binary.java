package coding;

class Base {
    int length;
    int width;
    int height;

    public Base(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}

class Child extends Base {
    int weight;
    int length;

    public Child(int length, int width, int height, int weight, int l) {
        super(length, width, height);
        this.weight = weight;
        this.length = l;
    }
}

public class binary {
    public static void main(String[] args) {
        Child c = new Child(1, 1, 1, 10, 10);
        System.out.println(c.length);
    }

}
