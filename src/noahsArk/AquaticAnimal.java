package noahsArk;

public class AquaticAnimal extends Eggs implements Animal {

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
		// TODO Auto-generated method stub
		
	}

}
