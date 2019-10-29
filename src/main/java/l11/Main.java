package l11;

import java.util.concurrent.TimeUnit;

public class Main {
    // don't do this!
    public static void main(String[] args) throws InterruptedException, BarsikException {
//        Throwable
        getInfo("barsik");
    }

    private static void getInfo(String name) throws BarsikException {
        if (name.equalsIgnoreCase("barsik")) {
            throw new BarsikException();
        }
    }
}
