package l10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        System.out.println(Thread.currentThread().getName());
        executor.execute((Runnable) () -> System.out.println(Thread.currentThread().getName() + " I am from another thread"));

        ExecutorService executor2 = Executors.newCachedThreadPool();
        executor2.execute( () -> System.out.println(Thread.currentThread().getName() + " I am from another thread"));
        executor2.execute( () -> System.out.println(Thread.currentThread().getName() + " I am from another thread"));
        executor2.execute( () -> System.out.println(Thread.currentThread().getName() + " I am from another thread"));
        executor2.execute( () -> System.out.println(Thread.currentThread().getName() + " I am from another thread"));

        ExecutorService executor3 =  Executors.newSingleThreadExecutor();
        executor3.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " I am from another thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor3.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " I am from another thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executor3.execute( () -> {
            System.out.println(Thread.currentThread().getName() + " I am from another thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor2.shutdown();
        executor3.shutdown();
    }
}
