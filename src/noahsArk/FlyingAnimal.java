package noahsArk;

public class FlyingAnimal extends Eggs implements Animal{

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " now flying, will come later when tired...");
		
	}

	
	@Override
	public void reproduce() {
		super.layEggs();
		
	}

	@Override
	public void makeSound() {		
	}

}
