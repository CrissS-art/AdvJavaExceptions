package AdvEx1_2Excep;

public class InhabitantsException extends Exception {
	private static final long serialversionUID = 1L;
	
	public InhabitantsException(String msg) {
		super(msg);
	}
	
	public InhabitantsException() {
		super("Il y a un problème de démographie !");
	}
}