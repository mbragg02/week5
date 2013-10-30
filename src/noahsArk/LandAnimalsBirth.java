package noahsArk;

public abstract class LandAnimalsBirth extends LandAnimal implements Birth {


	@Override
	public void reproduce() {
		giveBirth();
	}

	@Override
	public void giveBirth() {
		System.out.println("Giving birth...");
	}

	
}