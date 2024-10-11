	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
public class AdvEx2_3Thread {

	/* Reprenez la classe ThreadTime, transmise par le formateur, et 
	 * apportez lui les modifications pour en faire une horloge qui 
	 * affiche l’heure, les minutes et les secondes en temps réel donc 
	 * le tout doit défiler « comme » une montre digitale. Vérifier 
	 * qu’elle fonctionne correctement sous Eclipse puis en la lançant 
	 * en ligne de commande. Laisser votre appli tourner en tache de 
	 * fond, et comparer là avec votre horloge système afin de vérifier 
		que ce soit bien cohérent.*/
	



	  public static void main(String[] args) {
	    DateFormat df = new SimpleDateFormat("HH:mm:ss");
	    Thread thread = new Thread(new MonRunnable(1000));

	    System.out.println(df.format(new Date()));

	    thread.start();
	  }

	  private static class MonRunnable implements Runnable {

	    private long delai;

	    public MonRunnable(long delai) {
	      this.delai = delai;
	    }

	    @Override
	    public void run() {
	    	while(true) {
		      try {
		        Thread.sleep(delai);
		        System.out.println("-");
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
	    	}
	    }
	  }
	}
}
