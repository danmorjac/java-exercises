package Task_14.Ej_8;


public class CitiesTester {


	public static void main(String[] args) {

		int gr1= 1;
		int gr2=2;
		int gr3=3;

		City c1 = new City("Valencia", 100000, gr1);
		City c2 = new City("Alicante", 942834, gr2);
		City c3 = new City("Barcelona", 10330000, gr3);
		City c4 = new City("Madrid", 1090450, gr2);

		ManagerCities citis = new ManagerCities();
 
		citis.addCity(c1);
		citis.addCity(c2);
		citis.addCity(c3);
		citis.addCity(c4);


		System.out.println(citis.toString());
		System.out.println("The number of citis are: "+citis.getNumberOfCities());
		System.out.println();

		citis.removeCity(c3);

		System.out.println(citis.toString());		
		System.out.println("The number of citis are: "+citis.getNumberOfCities());
		System.out.println();

		System.out.println("And the total population is: "+citis.getTotalPopulation());
		System.out.println();

		System.out.println("And the city with te highest population is: "+citis.getCityWithHighestPopulation());
		System.out.println();

	//	System.out.println("The cities with the code " +gr1 +" are: "+citis.getCitiesByProvinceCode(gr1));





	}
}

