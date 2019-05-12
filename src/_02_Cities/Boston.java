package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = (1*getPopulation())*getGrowthRate()+getPopulation()/2;
		return taxes;
	}

}
