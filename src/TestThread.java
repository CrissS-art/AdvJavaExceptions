import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestThread extends AdvEx2_3Thread {

	public static void main(String[] args) {
		Date currentDate = new Date();
	    DateFormat df = new SimpleDateFormat("hh:mm:ss");
	    System.out.println(df.format(currentDate));
	    Thread thread = new Thread(new MyRunnable(1000));

	    thread.start();
	}

}
