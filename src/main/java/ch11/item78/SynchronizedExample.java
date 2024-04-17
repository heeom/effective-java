package ch11.item78;

import java.util.concurrent.TimeUnit;

public class SynchronizedExample {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (!stopRequested()) {
                i++;
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }
}

