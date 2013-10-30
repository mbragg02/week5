package noahsArk;

public class LandAnimalEggs extends LandAnimal implements Eggs  {

	private void layEggs() {
		System.out.println("Laying an egg");
		
	}
	@Override
	public void reproduce() {
		layEggs();
	}


}
