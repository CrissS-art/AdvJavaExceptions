package AdvEx1_2Excep;

public class TestCity {

	public static void main(String[] args) {

        City toulouse = new City("Toulouse", "France");
        toulouse.trySetInhabitants(-120);
        
        City chalon = new City("Chalon", "France");
        chalon.trySetInhabitants(61000);
        
        City tarbes = new City("Tarbes", "France");
        tarbes.trySetInhabitants(45000);
        
        City montréal = new City("Montréal", "Québec");
        montréal.trySetInhabitants(3500000);
    }
}
