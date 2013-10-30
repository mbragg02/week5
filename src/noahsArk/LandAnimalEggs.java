package noahsArk;

public class LandAnimalEggs extends Eggs implements Animal {

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " coming...");
		
	}

	@Override
	public void reproduce() {
		super.layEggs();
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}




}
