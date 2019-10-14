package l9.atm;

public class Ex {
    private final Object key = new Object();

    public static void main(String[] args) {

    }

    private void getInfo() {

        synchronized (this) {
            System.out.println();
        }

    }
}
