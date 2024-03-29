package l10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicEx implements Runnable{
    private int i = 0;

    public int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }


    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        AtomicEx atomicEx = new AtomicEx();
        executor.execute(atomicEx);

        while (true) {
            int val = atomicEx.getValue();

            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
