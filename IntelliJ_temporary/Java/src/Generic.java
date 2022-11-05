import java.util.ArrayList;

public class Generic {

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ":" + i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

    }
}