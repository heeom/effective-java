package ch11.item78;

import java.util.concurrent.TimeUnit;

public class AsynchronousExample {
    private static boolean stopRequested = false;

    public static void main(String[] args) throws InterruptedException {
        // 무한 실행
        new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                i++;
            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
