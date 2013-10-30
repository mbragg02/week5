package noahsArk;

public abstract class LandAnimal implements Animal {

	@Override
	public void call(String animalName) {
			System.out.println(animalName + " coming...");
	}

}
