package l9;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        RunnableEx ex = new RunnableEx();
        Thread thread = new Thread(ex);
        thread.start();

        TheadEx theadEx = new TheadEx();
        theadEx.start();

        Thread thread2 = new Thread(() -> System.out.println("I am anonymous class from another thread "
                + Thread.currentThread().getName()));

        thread2.start();

        new Thread(() -> System.out.println("I am anonymous class from another thread "
                + Thread.currentThread().getName())).start();

    }
}
