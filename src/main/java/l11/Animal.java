package l11;

import java.util.concurrent.TimeUnit;

public class Animal {
    public Animal() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
