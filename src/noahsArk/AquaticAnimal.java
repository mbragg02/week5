package noahsArk;

public class AquaticAnimal implements Animal, Eggs {

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " will not come...");	
	}

	@Override
	public void reproduce() {
		layEggs();
		
	}

	@Override
	public void makeSound() {		
	}


	@Override
	public void layEggs() {
		System.out.println("Laying eggs...");
		
	}

}
