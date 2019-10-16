package l10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priotity;

    public SimplePriorities(int priotity) {
        this.priotity = priotity;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ":" + countDown;
    }

    @Override
    public void run() {
        // it's not
        Thread.currentThread().setPriority(priotity);

        while (true) {
            // high load operation
            for (int i = 0; i < 100000; i++) {
                d+= (Math.PI + Math.E) / (double) i;

                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }

            System.out.println(this);

            if(--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        for (int i = 0; i < 5; i++) {
            executor.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }

        executor.shutdown();
    }
}
