package l10;

import java.util.concurrent.TimeUnit;

public class InterruptEx {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.err.println(Thread.currentThread().isInterrupted());

            for (int i = 0; i < 100000000; i++) {
                System.err.println(i);

                if (Thread.currentThread().isInterrupted()) {
                    System.err.println(Thread.currentThread().isInterrupted());
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {

                    }
                    System.err.println("WakeUp!");
                    break;
                }
            }

            System.err.println(Thread.currentThread().isInterrupted());
        });

        System.err.println("start...");
        thread.start();

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
        System.err.println("finish...");
    }
}
