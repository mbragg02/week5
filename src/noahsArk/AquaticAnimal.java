package noahsArk;

public class AquaticAnimal implements Animal, Eggs {

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " will not come...");
		
	}

	private void layEggs() {
		System.out.println("Laying an egg");
	}

	@Override
	public void reproduce() {
		layEggs();
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
