package noahsArk;

public class LandAnimalsBirth extends Birth implements Animal {

	@Override
	public void call(String animalName) {
		System.out.println(animalName + " coming...");
		
	}

	@Override
	public void reproduce() {
		super.giveBirth();
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}





}
