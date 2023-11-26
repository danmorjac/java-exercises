package Task_14.Ej_8;

import java.util.Iterator;
import java.util.LinkedList;


public class ManagerCities {

	private LinkedList<City> cities;

	public ManagerCities() {
		cities = new LinkedList<City>();
	}

	public void addCity(City city) {
		cities.add(city);
	}

	public void removeCity(City city) {
		cities.remove(city);
	}

	public int getNumberOfCities() {
		return cities.size();
	}

	public long getTotalPopulation() {
		long total = 0;
		for (City city : cities) {
			total += city.getPopulation();
		}
		return total;
	}

	public City getCityWithHighestPopulation() {
		City highestCity = cities.get(0);
		for (City city : cities) {
			if (city.getPopulation() > highestCity.getPopulation()) {
				highestCity = city;
			}
		}
		return highestCity;
	}

//	public LinkedList<City> getCitiesByProvinceCode(int code) {
//		Iterator<City> result = cities.iterator();
//		while (result.hasNext()) {
//			if (city.getProvinceCode() == code) {
//				result.add(city);
//			}
//		}
//		return result;
//	}

	@Override
	public String toString() {

		String info="";

		for(int i=0;i<cities.size();i++) {
			if(i == cities.size()-1)info += cities.get(i);
			else info += cities.get(i) + "\n";
		}




		return info;


	}



}



