import java.util.Date;

public class AdvEx1Excep {

	public static void main(String[] args) {
		// Exercice 1.1 : Le programme suivant présente des problèmes, trouver lesquels et 
//		utiliser tous les moyens permettant l’affichage des 2 instructions en 
//		utilisant notamment le mécanisme d’exception
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
