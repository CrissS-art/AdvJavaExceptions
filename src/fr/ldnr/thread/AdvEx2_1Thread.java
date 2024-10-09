package fr.ldnr.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdvEx2_1Thread {

  public static void main(String[] args) {
    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Thread thread = new Thread(new MyRunnable(1000));
    
//    Reprenez la classe TestThread et modifier là pour obtenir qqchose qui ressemble à...	

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
	        for(int i = 1; i<=5; i++){
	        	for(int j = 0; j < 5 - (i-1); j++)
	        	System.out.print(i + " - ");
	        	Thread.sleep(delay);
	        } System.out.println(j);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
    	}
    	}
  }
}
} 

/* dire que si n est afficher s'ensuit n * "-"
boucle tape dans un tableau int
for(i = 1; i<5; i++){*/

