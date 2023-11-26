package Task_14.Ej_8;



public class City {
	public String name;
	private long population;
	private int provinceCode;

	public City(String name, long population, int provinceCode) {
		this.name = name;
		this.population = population;
		this.provinceCode = provinceCode; 
	}

	public String getName() {
		return name;
	}

	public long getPopulation() {
		return population;
	}

	public int getProvinceCode() {
		return provinceCode;
	}

	@Override
	public String toString() {
		return "City name=" + name + ", population=" + population + ", provinceCode=" + provinceCode;
	}
	

}

