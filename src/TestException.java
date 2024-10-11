import java.util.Date;

public class TestException  {
	
	public static void main(String[] args) {

	Object getDate = null;
	Object getToday = new Date();
			
			try {
			System.out.println(getDate.getClass().getName());
			System.out.println(getToday.getClass().getName());
			}
			catch(java.lang.NullPointerException e) {
				System.out.println("Nous ne pouvons afficher la date "
						+ "car la valeur date est 'null' : \n" + e);
			}
		}
}