package noahsArk;

public abstract class LandAnimalEggs extends LandAnimal implements Eggs {

	@Override
	public void reproduce() {
		layEggs();
		
	}


	@Override
	public void layEggs() {
		System.out.println("Laying an egg");
		
		
	}


	



}
