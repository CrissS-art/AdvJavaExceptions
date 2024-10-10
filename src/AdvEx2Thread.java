
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvEx2Thread {

  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Thread thread = new Thread(new MyRunnable(1000));

    System.out.println(df.format(new Date()));

    thread.start();
  }

  private static class MyRunnable implements Runnable {

    private long delay;

    public MyRunnable(long delay) {
      this.delay = delay;
    }

    @Override
    public void run() {
    	while(true) {
            try {
                Thread.sleep(delay);
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j < (6 - i); j++) { 
                        System.out.print(i + " - "); 
                    }
                    System.out.println(); 
                }
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
    	}
    }
  }
}