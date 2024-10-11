public class TestException {

	public static void main(String[] args) {
		
		AdvEx1Excep dates = new AdvEx1Excep();
		
		try {
		System.out.println(dates.getDate().getClass().getName());
		System.out.println(dates.getToday().getClass().getName());
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("Nous ne pouvons afficher la date "
					+ "car la valeur date est 'null' : \n" + e);
		}
	}
}
