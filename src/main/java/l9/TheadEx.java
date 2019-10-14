package l9;

public class TheadEx extends Thread {
    @Override
    public void run() {
        System.out.println("I am from another thread " + Thread.currentThread().getName());
    }
}
