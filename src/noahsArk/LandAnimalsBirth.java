package noahsArk;

public class LandAnimalsBirth extends LandAnimal implements Birth {

	@Override
	public void giveBirth() {
		System.out.println("Giving birth");

		
	}
	@Override
	public void reproduce() {
		giveBirth();
	}



}
