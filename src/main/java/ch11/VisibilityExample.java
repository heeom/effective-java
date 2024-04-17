package ch11;

public class VisibilityExample {
    private static boolean flag = false;

    public static void main(String[] args) {

        new Thread(() -> {
            flag = true;
        }).start();

        new Thread(() -> {
            if (flag) {
                System.out.println("flag is now " + flag);
            }
        }).start();

    }
}
