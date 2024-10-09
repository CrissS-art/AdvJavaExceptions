package AdvEx1_2Excep;

public class TestCity {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		City toulouse;
		try {
			toulouse = new City("Toulouse","France",450000);
		} catch (InhabitantsException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unused")
		City chalon;
		try {
			chalon = new City("Chalon","France",61000);
		} catch (InhabitantsException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unused")
		City tarbes;
		try {
			tarbes = new City("Tarbes","France",45000);
		} catch (InhabitantsException e) {
			e.printStackTrace();
		}
		@SuppressWarnings("unused")
		City montréal;
		try {
			montréal = new City("Montréal","Québec",3500000);
		} catch (InhabitantsException e) {
			e.printStackTrace();
		}
		
	}

}
