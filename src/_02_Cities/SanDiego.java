package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}


	double getAnnualTaxes() {
		double taxes = getPopulation() * getGrowthRate();
		taxes+=1000000;
		return taxes;
	}
}
