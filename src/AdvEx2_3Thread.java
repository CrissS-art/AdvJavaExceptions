import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvEx2_3Thread {

    static class MyRunnable implements Runnable {
        private long delay;

        public MyRunnable(long delay) {
            this.delay = delay;
        }

        @Override
        public void run() {
            DateFormat df = new SimpleDateFormat("hh:mm:ss");
            try {
                while (true) {
                    for (int i = 0; i < 60; i++) {
                        System.out.println();
                    }
                    Date currentDate = new Date();
                    System.out.println(df.format(currentDate)); 

                    Thread.sleep(delay); 
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
