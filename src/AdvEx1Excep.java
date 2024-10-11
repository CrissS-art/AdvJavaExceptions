import java.util.Date;

public class AdvEx1Excep {

	public static void main(String[] args) {

		Date date = null;
		Date today = new Date();
		
		try {
		System.out.println(date.getClass().getName());
		System.out.println(today.getClass().getName());
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("Nous ne pouvons afficher la date "
					+ "car la valeur date est 'null' : \n" + e);
		}
	}

}
