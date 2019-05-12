package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Cow cow = new Cow();
		Fish fish = new Fish();
		Pig pig = new Pig();
		Bird bird = new Bird();
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(cow);
		farm.add(pig);
		farm.add(fish);
		farm.add(bird);
		
		for(Animal s : farm) {
			s.makeNoise();
		}
		
		
		
	}
}
