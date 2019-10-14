package l9;

public class RunnableEx implements Runnable {
    @Override
    public void run() {
        System.out.println("I am from another thread " + Thread.currentThread().getName());
    }
}
