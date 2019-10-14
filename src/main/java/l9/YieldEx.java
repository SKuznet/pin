package l9;

public class YieldEx {
    public static void main(String[] args) {
        for (int i = 0; i < 3 ; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 20; j++) {
                        System.out.println(Thread.currentThread().getName() + " " + j);
                        Thread.yield();
                    }
                }
            });
            thread.start();
        }

    }
}
