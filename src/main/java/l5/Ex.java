package l5;

public class Ex {
    private int i;
    private static int count;

    static {
        count = 25;
    }

    public Ex() {
    }

    // initializer block
    {
        count = 26;
        i = 5;
    }

    public static void main(String[] args) {
        Ex ex = new Ex();
        System.out.println(ex.i);
        System.out.println(count);
    }
}
