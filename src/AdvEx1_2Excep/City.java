package AdvEx1_2Excep;

public class City {

	// Attributes
		private String cityName;
		private String country;	
		private int inhabitants;

	// Constructors
		public City(String cityName, String country, int inhabitants) throws InhabitantsException {
			setCityName(cityName);
			setCountry(country);
			setInhabitants(inhabitants);
		}
		
		public City(String cityName, String country) {
			setCityName(cityName);
			setCountry(country);
		}
		
	// Accesseurs
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getInhabitants() {
			return inhabitants;
		}
		public void setInhabitants(int inhabitants) throws InhabitantsException {
			if (inhabitants < 0) {
				throw new InhabitantsException("L'insee émet des réserves concernant le "
						+ "changement de population que vous souhaitez faire ! ");
			}
			this.inhabitants = inhabitants;
		}
		
		public void trySetInhabitants(int inhabitants) {
			try {
				setInhabitants(inhabitants); 
			} 	catch (InhabitantsException e) {
					System.out.println(e.getMessage());
		}
		}

		public String  toString() {
			return "BornCity [name=" + getCityName() + ", state=" + getCountry() + ", "
					+ "nbInhabitants="+ getInhabitants() +"]";
		}
	}
