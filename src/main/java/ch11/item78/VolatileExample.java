package ch11.item78;

import java.util.concurrent.TimeUnit;

public class VolatileExample {

    private static volatile boolean stopRequested;
    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
           int i = 0;
           while(!stopRequested) {
               i++;
           }
        }).start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
