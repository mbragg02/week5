package noahsArk;

public class FlyingAnimal implements Animal, Eggs{

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " now flying, will come later when tired...");		
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
