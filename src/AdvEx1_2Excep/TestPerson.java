package AdvEx1_2Excep;

public class TestPerson {

	public static void main(String[] args) throws InhabitantsException {

		Person manu = new Person("Macron","Emmanuel",46,"Elysée à Paris",new City("Amiens","France"));
		Person cosette = new Person("Sarkozy","Nicolas",69,"Elevé à Paris",new City("Paris","France", 2000000));
		Person borissette = new Person("Johnson","Boris",59,"Downing Street à London",new City("New-York","USA"));
		Person gege = new Person("Depardieu","Gérard",75,"Moscow",new City("Châteauroux","France"));
		Person len = new Person("Kravitz","Lenny",59,"hôtel particulier à Paris",new City("New-York","USA"));
		Person jen = new Person("Lawrence","Jennifer",33,"Louisville aux USA",new City("Indian Hills","USA"));

		
		String searchCapitalCity = "Paris"; 
		String searchCountryName = "France";
		Person[] people = {manu,cosette,borissette,gege,len,jen};
		
		try {
			manu.getBirthCity().setInhabitants(-150);
		} catch (InhabitantsException e) {
			e.printStackTrace();
		}
		
		for (Person person : people) {

            boolean bornInFrance = person.getBirthCity() != null && person.getBirthCity().getCountry().equalsIgnoreCase(searchCountryName);
            boolean livesInParis = person.getAddress() != null && person.getAddress().toLowerCase().contains(searchCapitalCity.toLowerCase());
				
				if(bornInFrance || livesInParis) {
					System.out.println(person);

		}

		}
	}

}
